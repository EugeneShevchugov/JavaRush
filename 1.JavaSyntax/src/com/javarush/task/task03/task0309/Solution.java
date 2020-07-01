package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a < 6; a++) {
            sum += a;
            System.out.println(sum);
        }
    }
}
