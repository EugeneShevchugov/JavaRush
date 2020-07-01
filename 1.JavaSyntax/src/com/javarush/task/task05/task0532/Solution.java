package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int a = 0;
        int N = sc.nextInt();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                a = sc.nextInt();
                if (a > maximum) {
                    maximum = a;
                }
            }

            System.out.println(maximum);
        }

    }
}
