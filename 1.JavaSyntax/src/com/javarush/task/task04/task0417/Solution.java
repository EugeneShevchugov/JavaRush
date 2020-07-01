package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = sc3.nextInt();
        if ((a == b && a ==c) || (b == a && b == c) || (c == a && c == b)) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
            System.out.print(" ");
            System.out.print(c);
        }
        else if (a == c) {
            System.out.println(a + " " + c);
        }
        else if (b == c) {
            System.out.println(b + " " + c);
        }
        else if (a == b) {

            System.out.println(a + " " + b);
        }

    }
}