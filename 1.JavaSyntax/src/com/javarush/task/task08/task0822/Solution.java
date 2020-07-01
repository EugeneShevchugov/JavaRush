package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < minimum) {
                minimum = array.get(i);
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new LinkedList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++) {
            String v = reader.readLine();
            int a = Integer.parseInt(v);
            list.add(a);
        }
        return list;
    }
}
