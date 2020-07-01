package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {
    int eggs = 20;
    public int getCountOfEggsPerMonth() {
        return eggs;
    }
    @Override
    String getDescription() {
        return "Я - курица. Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
