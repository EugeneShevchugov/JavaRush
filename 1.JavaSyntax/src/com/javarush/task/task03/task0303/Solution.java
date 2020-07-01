package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(20, 60));
        System.out.println(convertEurToUsd(30, 40));
    }

    public static double convertEurToUsd(int eur, double course) {
        double result = 0;
        result = eur*course;
        return result;
    }
}
