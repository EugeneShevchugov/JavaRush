package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double result = 0;
        result = i * 0.1 + i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
