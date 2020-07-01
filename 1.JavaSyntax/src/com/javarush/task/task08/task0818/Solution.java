package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Karpov", 600);
        map.put("Govnoed", 700);
        map.put("Piska", 800);
        map.put("Jopa", 100);
        map.put("a",1500);
        map.put("b",1600);
        map.put("c",1799);
        map.put("d",1753);
        map.put("e",1234);
        map.put("f",14567);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}