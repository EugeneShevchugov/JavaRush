package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(14.5, "Test");
        labels.put(14.6, "Test5");
        labels.put(14.7, "Test4");
        labels.put(14.8, "Test3");
        labels.put(14.9, "Test2");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
