package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Object value, double pi) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        pi = 3.14;
        System.out.println(pi);
    }

    public static void printMatrix(int m, int n, Object value, int ci) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        ci = 3;
        System.out.println(ci);
    }

    public static void printMatrix(int m, int n, Object value, float ba) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        ba = 4;
        System.out.println(ba);
    }

    public static void printMatrix(int m, int n, Object value, Integer a) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        a = 14;
        System.out.println(a);
    }

    public static void printMatrix(int m, int n, Object value, int a, int b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        a = 5;
        b = 3;
        System.out.println(a+b);
    }

    public static void printMatrix(int m, int n, Object value,int a, int b, int c) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        a = 5;
        b = 3;
        c = a + b;
        System.out.println(c);
    }

    public static void printMatrix(int m, int n, Object value, Integer c, Double fi) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        c = 4;
        fi = 4.14;
        System.out.println(c + fi);
    }

    public static void printMatrix(int m, int n, Object value, Double b) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        b = 5.4;
        System.out.println(b);
    }
}
