package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == -1) {
                sum += number;
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
