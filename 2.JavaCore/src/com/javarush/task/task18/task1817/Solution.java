package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int spaceCount = 0;
        int charCount = 0;

        while (fileReader.ready()) {
            char ch = (char) fileReader.read();
            charCount++;
            if (ch == ' ') {
                spaceCount++;
            }
        }
        fileReader.close();

        System.out.println(String.format("%.2f", ((float) (spaceCount / charCount) * 100)));

        
    }
}
