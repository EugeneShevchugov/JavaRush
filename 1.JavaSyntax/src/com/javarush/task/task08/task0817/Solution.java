package com.javarush.task.task08.task0817;

import java.util.*;
import java.util.Collections.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Levandovski1", "Pidoras11");
        map.put("Levandovski2", "Pidoras9");
        map.put("Levandovski3", "Pidoras8");
        map.put("Levandovski4", "Pidoras7");
        map.put("Levandovski5", "Pidoras6");
        map.put("Levandovski6", "Pidoras5");
        map.put("Levandovski7", "Pidoras4");
        map.put("Levandovski8", "Pidoras3");
        map.put("Levandovski9", "Pidoras2");
        map.put("Levandovski11", "Pidoras1");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> uniq = new HashSet<>(), duplicate = new HashSet<>();
        for (String s: map.values()) if (!uniq.add(s)) duplicate.add(s);
        for (String s: duplicate) removeItemFromMapByValue(map, s);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
