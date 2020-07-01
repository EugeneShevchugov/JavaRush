package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int a, int b) {
        int temp = 0;
        if (a > b) {
            temp = a;
        }
        else {
            temp = b;
        }
        return temp;
    }

    public static long max(long a, long b) {
        long temp = 0;
        if (a > b) {
            temp = a;
        }
        else {
            temp = b;
        }
        return temp;
    }

    public static double max(double a, double b) {
        double temp = 0.0;
        if (a > b) {
            temp = a;
        }
        else {
            temp = b;
        }
        return temp;
    }
}
