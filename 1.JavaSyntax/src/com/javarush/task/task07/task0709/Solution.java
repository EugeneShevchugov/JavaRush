package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int minInt = Integer.MAX_VALUE;
        String minString = "";
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(i,s);
            if (s.length() < minInt) {
                minInt = s.length();
                minString = s;
            }
        }
        System.out.println(minString);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() == minInt && list.get(i) != minString) {
                System.out.println(s);
            }
        }
    }
}
