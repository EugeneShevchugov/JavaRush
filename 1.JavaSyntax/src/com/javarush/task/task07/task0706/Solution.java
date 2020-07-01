package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        int checkeven = 0;
        int checkodd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
            if (i % 2 == 0) {
                checkeven += arr[i];
            }
            else {
                checkodd += arr[i];
            }
        }
        checkeven = checkeven + arr[0];
        if (checkeven > checkodd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
