package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        FileInputStream f = new FileInputStream(fileName);
        TreeSet<Integer> hob = new TreeSet<>();
        while(f.available() > 0) {
            hob.add(f.available());
        }
        f.close();

        for (int value : hob)
            System.out.print(value + " ");
    }
}
