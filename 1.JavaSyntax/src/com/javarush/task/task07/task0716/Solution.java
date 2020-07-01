package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лира"); // 1
        list.add("лоза"); // 2
        list.add("мера");
        list.add("вода");
        list.add("упор");
        list = fix(list);


        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("р") && !s.contains("л")) {
                list.remove(i);
                i--;
            }
            if (s.contains("л") && !s.contains("р")) {
                list.add(i+1, list.get(i));
                i++;
            }
            if (s.contains("л") && s.contains("р")) {

            }

        }

        return list;
    }
}