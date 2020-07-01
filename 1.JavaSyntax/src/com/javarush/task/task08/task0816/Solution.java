package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Gay1", df.parse("JANUARY 2 1986"));
        map.put("Gay2", df.parse("JULY 7 1987"));
        map.put("Gay3", df.parse("AUGUST 3 1988"));
        map.put("Gay4", df.parse("SEPTEMBER 2 1999"));
        map.put("Gay5", df.parse("NOVEMBER 1 1989"));
        map.put("Gay6", df.parse("DECEMBER 1 1979"));
        map.put("Gay7", df.parse("DECEMBER 3 1929"));
        map.put("Gay8", df.parse("AUGUST 4 1949"));
        map.put("Gay", df.parse("MARCH 5 1959"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date data = pair.getValue();
            String test = pair.getKey();
            map.values().removeIf(s -> s.getMonth()==5 || s.getMonth()==6 || s.getMonth()==7);
        }

    }

    public static void main(String[] args) {

    }
}
