package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String mS = "";
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(i,s);
        }

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() > max) {
                max = s.length();
                mS = s;
            }
        }
        System.out.println(mS);
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() == max && strings.get(i) != mS) {
                System.out.println(s);
            }
        }
    }
}
