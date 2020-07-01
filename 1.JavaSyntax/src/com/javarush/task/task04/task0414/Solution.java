package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("количество дней в году: 366");
                    return;
                }
                else {
                    System.out.println("количество дней в году: 365");
                    return;
                }
            }
            System.out.println("количество дней в году: 366");
            return;
        }
        else {
            System.out.println("количество дней в году: 365");
            return;
        }
    }
}