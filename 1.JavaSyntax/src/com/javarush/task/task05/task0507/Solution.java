package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double check = 0;
        double sum = 0;
        double a = 0;
        double result = 0;
        while (a != -1) {
            a = sc.nextInt();
            if (a == -1) {
                result = sum/check;
                System.out.println(result);
            }
            sum += a;
            check++;
        }
    }
}

