package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        int need = 0;
        int test = 44;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == test) {
                need++;
            }
        }
        System.out.println(need);
        inputStream.close();
        reader.close();
    }
}
