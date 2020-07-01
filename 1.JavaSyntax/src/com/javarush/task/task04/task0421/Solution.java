package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        }
        if (n1.length() == n2.length() && !n1.equals(n2)) {
            System.out.println("Длины имен равны");
        }
        if (!n1.equals(n2) && n2.length() != n1.length()) {

        }
    }
}
