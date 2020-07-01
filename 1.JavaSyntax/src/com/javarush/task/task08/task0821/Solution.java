package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Test1", "Teeeest9");
        map.put("Test1", "Teeeest8");
        map.put("Test2", "Teeeest7");
        map.put("Test3", "Teeeest6");
        map.put("Test4", "Teeeest5");
        map.put("Test5", "Teeeest4");
        map.put("Test6", "Teeeest3");
        map.put("Test7", "Teeeest2");
        map.put("Test8", "Teeeest1");
        map.put("Test9", "Teeeest1");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
