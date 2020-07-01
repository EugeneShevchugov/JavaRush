package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int flag = 1;
        while (flag != 0) {
            try {
                String s = reader.readLine();
                int a = Integer.parseInt(s);
                list.add(a);
            }
            catch (NumberFormatException e) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                flag = 0;
            }
            catch (IOException e) {

            }


        }
    }
}
