package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int i = sc.nextInt();
        while (i != 0) {
            a = i % 10;
            if (a % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            i /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
