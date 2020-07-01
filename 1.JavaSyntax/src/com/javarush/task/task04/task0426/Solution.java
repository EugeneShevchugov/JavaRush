package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0 && number % 2 == 0) {
            System.out.println("отрицательное четное число");
        }
        else if (number < 0 && number % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
        else if (number > 0 && number % 2 == 0) {
            System.out.println("положительное четное число");
        }
        else if (number > 0 && number %2 != 0) {
            System.out.println("положительное нечетное число");
        }
        else if (number == 0) {
            System.out.println("ноль");
        }
    }
}
