package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "мама";
        String s2 = "мыла";
        String s3 = "раму";
        String im = "именно";
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,s);
        list.add(1,im);
        list.add(2,s2);
        list.add(3,im);
        list.add(4,s3);
        list.add(5,im);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
