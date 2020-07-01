package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    int eggs = 10;
    public int getCountOfEggsPerMonth() {
        return eggs;
    }
    @Override
    String getDescription() {
        return "Я - курица. Моя страна - Russia. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
