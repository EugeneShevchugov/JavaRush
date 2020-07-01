package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i > 0; i--) {
            System.out.print(8);
            for (int j = n; j > 1; j--) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
