package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        String s = reader.readLine();
        ArrayList<Character> list = new ArrayList<Character>();

        try {

            inputStream = new FileInputStream(s);

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char a = (char)buffer.read();

                if (a % 2 == 0) {
                    list.add(a);
                }

            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
            reader.close();
        }
        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
