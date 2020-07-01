package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        inputStream.close();
        Collections.sort(list);
        int check = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i)) {
                check++;
            }
        }
        System.out.print(check);
        reader.close();
    }
}
