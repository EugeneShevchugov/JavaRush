package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = 0;
        if (a > 0) {
            res++;
        }
        if (b > 0) {
            res++;
        }
        if (c > 0) {
            res++;
        }
        System.out.println(res);
    }
}
