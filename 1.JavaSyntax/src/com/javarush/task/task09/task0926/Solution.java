package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<int[]>();
        int x = 0;
        int[] m1 = new int[5];
        int[] m2 = new int[2];
        int[] m3 = new int[4];
        int[] m4 = new int[7];
        int[] m5 = new int[0];
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        m1[0] = 0;
        m1[1] = 1;
        m1[2] = 2;
        m1[3] = 3;
        m1[4] = 4;
        m2[0] = 0;
        m2[1] = 1;
        m3[0] = 0;
        m3[1] = 1;
        m3[2] = 2;
        m3[3] = 3;
        m4[0] = 0;
        m4[1] = 1;
        m4[2] = 2;
        m4[3] = 3;
        m4[4] = 4;
        m4[5] = 5;
        m4[6] = 6;
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
