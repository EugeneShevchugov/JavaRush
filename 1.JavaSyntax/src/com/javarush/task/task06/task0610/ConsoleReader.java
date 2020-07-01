package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static int readInt() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static double readDouble() throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        return a;
    }

    public static boolean readBoolean() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        return a;
    }

    public static void main(String[] args) {

    }
}
