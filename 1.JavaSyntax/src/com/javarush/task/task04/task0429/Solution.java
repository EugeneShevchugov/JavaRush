package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resplus = 0;
        int resminus = 0;
        if (a > 0 && a != 0) {
            resplus++;
        }
        else if (a < 0 && a != 0) {
            resminus++;
        }
        if (b > 0  && b != 0) {
            resplus++;
        }
        else if (b < 0 && b != 0) {
            resminus++;
        }
        if (c > 0 && c != 0) {
            resplus++;
        }
        else if (c < 0 && c != 0) {
            resminus++;
        }
        System.out.println("количество положительных чисел: " + resplus);
        System.out.println("количество отрицательных чисел: " + resminus);
    }
}
