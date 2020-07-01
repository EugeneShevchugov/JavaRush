package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String fn = sc1.nextLine();
        String sn = sc2.nextLine();
        String tn = sc3.nextLine();
        System.out.println(fn + " + " + sn + " + " + tn + " = Чистая любовь, да-да!");
    }
}