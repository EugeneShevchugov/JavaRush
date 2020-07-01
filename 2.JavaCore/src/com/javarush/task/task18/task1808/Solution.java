package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(f1);
        FileInputStream inputStream2 = new FileInputStream(f2);
        FileInputStream inputStream3 = new FileInputStream(f3);
        FileOutputStream outputStream2 = new FileOutputStream(f2);
        FileOutputStream outputStream3 = new FileOutputStream(f3);
        byte[] buffer = new byte[1000];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer);
            if (count % 2 != 0) {
                outputStream2.write(buffer, 0 , (count/2)+1);
                outputStream3.write(buffer, (count/2)+1, count-6);
            }
            else {
                outputStream2.write(buffer, 0, count/2);
                outputStream3.write(buffer, count/2, count-6);
            }
        }
        inputStream1.close();
        inputStream2.close();
        inputStream3.close();
        outputStream2.close();
        outputStream3.close();
    }
}
