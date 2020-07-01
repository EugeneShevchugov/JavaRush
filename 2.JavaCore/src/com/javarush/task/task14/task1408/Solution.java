package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            if (country.equals(RUSSIA)) {
                Hen hen = new RussianHen();
                return hen;
            }
            else if (country.equals(BELARUS)) {
                Hen hen = new BelarusianHen();
                return hen;
            }
            else if (country.equals(UKRAINE)) {
                Hen hen = new UkrainianHen();
                return hen;
            }
            else if (country.equals(MOLDOVA)) {
                Hen hen = new MoldovanHen();
                return hen;
            }
            else {
                Hen hen = null;
                return hen;
            }
        }
    }





}
