package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String s1 = "Test";
        String s2 = "Test2";
        String s3 = "test3";
        String s4 = "Test4";
        String s5 = "Test5";
        list.add(0,s1);
        list.add(1,s2);
        list.add(2,s3);
        list.add(3,s4);
        list.add(4,s5);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
