package com.javarush.task.task09.task0917;

/* 
Перехват unchecked-исключений
*/

import java.io.UncheckedIOException;

public class Solution {
    public static void main(String[] args) throws NullPointerException, IndexOutOfBoundsException, NumberFormatException {
        try {
            handleExceptions(new Solution());
        }
        catch (Exception e) {
            printStack(e);
        }
    }

    public static void handleExceptions(Solution obj) throws NullPointerException, IndexOutOfBoundsException, NumberFormatException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RuntimeException e) {
            printStack(e);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

