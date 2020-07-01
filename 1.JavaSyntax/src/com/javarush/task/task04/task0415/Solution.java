package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b= sc2.nextInt();
        int c = sc3.nextInt();
        if (c >= (a+b) || b >= (a+c) || a >= (b+c)) {
            System.out.println("Треугольник не существует.");
        }
        else {
            System.out.println("Треугольник существует.");
        }
    }
}