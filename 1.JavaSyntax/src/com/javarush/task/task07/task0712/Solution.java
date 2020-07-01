package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String maxString = "";
        String minString = "";
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
            if (s.length() > max) {
                max = s.length();
                maxString = s;
            }
            if (s.length() < min) {
                min = s.length();
                minString = s;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s == maxString) {
                System.out.println(s);
                return;
            }
            else if (s == minString) {
                System.out.println(s);
                return;
            }
        }

    }
}
