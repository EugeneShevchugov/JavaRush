package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        if (a > b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}