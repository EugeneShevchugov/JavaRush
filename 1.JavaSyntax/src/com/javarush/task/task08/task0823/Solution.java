package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++)
            if(i==0 || sb.charAt(i-1) == ' ')
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        System.out.println(sb.toString());
    }
}
