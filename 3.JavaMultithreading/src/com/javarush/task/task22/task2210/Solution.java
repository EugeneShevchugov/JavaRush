package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        List<String> words = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            words.add(token);
        }
        String[] array = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            array[i] = words.get(i);
        }
        return array;
    }
}
