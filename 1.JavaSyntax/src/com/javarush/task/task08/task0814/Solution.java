package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(27);
        set.add(26);
        set.add(24);
        set.add(25);
        set.add(23);
        set.add(22);
        set.add(21);
        set.add(20);
        set.add(14);
        set.add(13);
        set.add(12);
        set.add(11);
        set.add(19);
        set.add(18);
        set.add(17);
        set.add(16);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> setIterator = set.iterator();
        while(setIterator.hasNext()){
            Integer nextInt = setIterator.next();
            if(nextInt > 10)
                setIterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
