package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        String s = list.get(0);
        int test = s.length();
        int check = 0;

        for (int i = 1; i < list.size(); i++) {
            String s1 = list.get(i);
            if (s1.length() <= test) {
                check = i;
                System.out.println(check);
                break;
            }
            else {
                test = s1.length();
            }
        }
        if (check == 0) {
            return;
        }

    }
}

