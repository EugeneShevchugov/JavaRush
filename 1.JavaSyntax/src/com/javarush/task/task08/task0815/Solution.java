package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Шевчугов", "Евгений");
        map.put("Теплова", "Елена");
        map.put("Григорьев", "Вадим3");
        map.put("Жож", "Дима");
        map.put("Пре", "Дима3");
        map.put("Прф", "Дима2");
        map.put("Пра", "Дима1");
        map.put("По", "Олег");
        map.put("Не", "Вадим1");
        map.put("При", "Вадим");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value == name) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
