package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String text = sc.nextLine();
            if (text.equals("сумма")) {
                break;
            }
            sum += Integer.parseInt(text);

        }
        System.out.println(sum);
    }
}
