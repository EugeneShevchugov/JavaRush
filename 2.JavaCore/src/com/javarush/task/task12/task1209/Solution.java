package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        int temp = 0;
        if (a > b) {
            temp = b;
        }
        else {
            temp = a;
        }
        return temp;
    }

    public static long min(long a, long b) {
        long temp = 0;
        if (a > b) {
            temp = b;
        }
        else {
            temp = a;
        }
        return temp;
    }

    public static double min (double a, double b) {
        double temp = 0.0;
        if (a > b) {
            temp = b;
        }
        else {
            temp = a;
        }
        return temp;
    }
}
