package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            arr[i] = a;
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }



        System.out.print(maximum + " " + minimum);
    }
}
