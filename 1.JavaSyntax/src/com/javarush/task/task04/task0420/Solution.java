package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= c && a >= b) {
            System.out.print(a + " ");
            if (c >= b) {
                System.out.print(c + " ");
                System.out.print(b);
            }
            else if (b >= c) {
                System.out.print(b + " ");
                System.out.print(c);
            }
        }
        else if (b >= a && b >= c) {
            System.out.print(b + " ");
            if (c > a) {
                System.out.print(c + " ");
                System.out.print(a);
            }
            else if (a >= c) {
                System.out.print(a + " ");
                System.out.print(c);
            }
        }
        else if (c >= b && c >= a) {
            System.out.print(c + " ");
            if (b > a) {
                System.out.print(b + " ");
                System.out.print(a);
            }
            else if (a >= b) {
                System.out.print(a + " ");
                System.out.print(b);
            }
        }
    }
}
