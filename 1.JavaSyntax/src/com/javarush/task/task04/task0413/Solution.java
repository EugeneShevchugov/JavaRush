package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == 1) {
            System.out.println("понедельник");
        }
        else if (data == 2) {
            System.out.println("вторник");
        }
        else if (data == 3) {
            System.out.println("среда");
        }
        else if (data == 4) {
            System.out.println("четверг");
        }
        else if (data == 5) {
            System.out.println("пятница");
        }
        else if (data == 6) {
            System.out.println("суббота");
        }
        else if (data == 7) {
            System.out.println("воскресенье");
        }
        else if (data > 7 || data <= 0) {
            System.out.println("такого дня недели не существует");
        }
    }
}