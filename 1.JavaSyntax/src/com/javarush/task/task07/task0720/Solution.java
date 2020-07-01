package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String s1 = reader.readLine();
        int n = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int m = Integer.parseInt(s2);
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(s);
        }


        for (int i = 0; i < m; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
