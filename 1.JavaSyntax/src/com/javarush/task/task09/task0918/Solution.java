package com.javarush.task.task09.task0918;

import java.io.UncheckedIOException;

/* 
Все свои, даже исключения
*/

import java.io.UncheckedIOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends Exception {
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends MyException3 {
    }
}

