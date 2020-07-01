package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
