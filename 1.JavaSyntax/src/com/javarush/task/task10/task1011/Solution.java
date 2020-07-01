package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuilder test = new StringBuilder(s);
        for (int i = 0; i < 40; i++) {
            System.out.println(test);
            test.deleteCharAt(0);
        }
    }

}

