package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int nod (int a, int b) {
        int div;
        if (a == b) {
            return a;
        }
        int d = a - b;
        if (d < 0) {
            d = -d;
            div = nod(a,d);
        }
        else {
            div = nod(b,d);
        }
        return div;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(t);
        if (a <= 0 || b <= 0) {
            throw new Exception();
        }
        int result = nod(a,b);
        System.out.println(result);
    }
}
