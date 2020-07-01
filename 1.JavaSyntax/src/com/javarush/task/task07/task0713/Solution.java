package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainarr = new ArrayList<Integer>();
        ArrayList<Integer> delthree = new ArrayList<Integer>();
        ArrayList<Integer> deltwo = new ArrayList<Integer>();
        ArrayList<Integer> delboth = new ArrayList<Integer>();
        int a = 0;
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            a = Integer.parseInt(s);
            mainarr.add(a);
        }

        for (int i = 0; i < 20; i++) {
            Integer x = mainarr.get(i);
            if (x % 3 == 0) {
                delthree.add(x);
            }
            if (x % 2 == 0) {
                deltwo.add(x);
            }
            if (x % 3 != 0 && x % 2 != 0) {
                delboth.add(x);
            }
        }
        printList(delthree);
        System.out.println();
        printList(deltwo);
        System.out.println();
        printList(delboth);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
