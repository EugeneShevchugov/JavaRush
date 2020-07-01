package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.intVar);
        System.out.println(test.doubleVar);
        System.out.println(test.DoubleVar);
        System.out.println(test.booleanVar);
        System.out.println(test.ObjectVar);
        System.out.println(test.ExceptionVar);
        System.out.println(test.StringVar);
    }
}
