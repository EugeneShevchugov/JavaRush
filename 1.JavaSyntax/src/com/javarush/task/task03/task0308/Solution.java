package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int result = 1;
        for (int a = 1; a < 11; a++) {
            result = result * a;
        }
        System.out.println(result);
    }
}
