package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
             a = Integer.parseInt(reader.readLine());
             list.add(0,a);
        }
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
