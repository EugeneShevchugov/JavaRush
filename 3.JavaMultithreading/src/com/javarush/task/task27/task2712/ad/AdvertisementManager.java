package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;

public class AdvertisementManager {

    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;   //время выполнения заказа поваром
    private List<Advertisement> playList = new ArrayList<>();

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException {
        if (storage.list().isEmpty() || getFixedMoviesList().isEmpty()) {
            throw new NoVideoAvailableException();
        }
        for (Advertisement advertisement : getBestAdList()) {
            System.out.println(advertisement);
            advertisement.revalidate();
        }
    }

    public List<Advertisement> getBestAdList() {
        List<List<Advertisement>> allCombinations = new ArrayList<>();
        getAllCombinations(allCombinations, getFixedMoviesList());
        if (allCombinations.size() != 1) {
            allCombinations = filterByAmount(allCombinations);
        }
        if (allCombinations.size() != 1) {
            allCombinations = filterByDuration(allCombinations);
        }
        if (allCombinations.size() != 1) {
            allCombinations.sort(Comparator.comparingInt(List::size));
        }
        return sortResultList(allCombinations.get(0));
    }

    public void getAllCombinations(List<List<Advertisement>> lists, List<Advertisement> list) {
        if (list.size() > 0 && !lists.contains(list)) {
            checkAdList(list, lists);
        }
        for (int i = 0; i < list.size(); i++) {
            List<Advertisement> newSet = new ArrayList<>(list);
            newSet.remove(i);
            getAllCombinations(lists, newSet);
        }
    }

    public List<Advertisement> getFixedMoviesList() {
        return storage.list().stream()
                .filter(advertisement -> advertisement.getDuration() <= timeSeconds)
                .filter(advertisement -> advertisement.getHits() > 0)
                .collect(Collectors.toList());
    }

    public List<List<Advertisement>> filterByAmount(List<List<Advertisement>> lists) {
        long maxAmount = getOverallAmount(lists.stream()
                .max(Comparator.comparingLong(this::getOverallAmount))
                .get());
        return lists.stream()
                .filter(ad -> getOverallAmount(ad) == maxAmount)
                .collect(Collectors.toList());
    }

    public List<List<Advertisement>> filterByDuration(List<List<Advertisement>> lists) {
        int maxDuration = getOverallDuration(lists.stream()
                .max(Comparator.comparingInt(this::getOverallDuration))
                .get());
        return lists.stream()
                .filter(ad -> getOverallDuration(ad) == maxDuration)
                .collect(Collectors.toList());
    }

    public List<Advertisement> sortResultList(List<Advertisement> resultList) {
        return resultList.stream().sorted(Comparator
                .comparingLong(Advertisement::getAmountPerOneDisplaying)
                .thenComparingLong(Advertisement::getAmountPerOneDisplaying).reversed())
                .collect(Collectors.toList());
    }

    public void checkAdList(List<Advertisement> list, List<List<Advertisement>> lists) {
        if (getOverallDuration(list) <= timeSeconds)
            lists.add(list);
    }

    public int getOverallDuration(List<Advertisement> list) {
        return list.stream().mapToInt(Advertisement::getDuration).sum();
    }

    public long getOverallAmount(List<Advertisement> list) {
        return list.stream().mapToLong(Advertisement::getAmountPerOneDisplaying).sum();
    }


}
