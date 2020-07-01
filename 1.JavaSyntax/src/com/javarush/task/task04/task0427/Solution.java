package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 1 || a > 999) {
            return;
        }
        else if (a % 2 == 0 && a / 10 == 0) {
            System.out.println("четное однозначное число");
        }
        else if (a % 2 != 0 && a / 10 == 0) {
            System.out.println("нечетное однозначное число");
        }
        else if (a % 2 == 0 && a / 100 == 0) {
            System.out.println("четное двузначное число");
        }
        else if (a % 2 != 0 && a / 100 == 0) {
            System.out.println("нечетное двузначное число");
        }
        else if (a % 2 == 0 && a / 1000 == 0) {
            System.out.println("четное трехзначное число");
        }
        else if (a % 2 != 0 && a / 1000 == 0) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
