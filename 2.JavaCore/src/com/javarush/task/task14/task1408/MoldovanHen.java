package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    int eggs = 20;
    public int getCountOfEggsPerMonth() {
        return eggs;
    }
    String s = getDescription();
    @Override
    String getDescription() {
        return "Я - курица. Моя страна - Moldova. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
