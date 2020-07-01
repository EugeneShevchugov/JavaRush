package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double light = sc.nextDouble();
        double b = light % 5;
        if (b >= 0 && b < 3) {
            System.out.println("зелёный");
        }
        else if (b >= 3 && b < 4) {
            System.out.println("жёлтый");
        }
        else if (b >= 4 && b < 5) {
            System.out.println("красный");
        }
    }
}