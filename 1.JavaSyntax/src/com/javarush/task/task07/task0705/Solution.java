package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }
        int[] secarr = new int[10];
        int[] tarr = new int[10];

        for (int i = 0; i < 10; i++) {
            secarr[i] = arr[i];
        }

        for (int i = 0; i < 10; i++) {
            tarr[i] = arr[i+10];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tarr[i]);
        }
    }
}
