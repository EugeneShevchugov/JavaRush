package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    int eggs = 20;
    public int getCountOfEggsPerMonth() {
        return eggs;
    }
    @Override
    String getDescription() {
        return "Я - курица. Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
