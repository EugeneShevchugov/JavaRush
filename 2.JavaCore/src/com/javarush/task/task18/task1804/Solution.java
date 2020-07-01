package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        HashMap<Integer, Integer> hashOfByte = new HashMap<>();
        int value;
        Integer count;
        while (fileInputStream.available() > 0) {
            value = fileInputStream.read();
            count = hashOfByte.get(value);

            if (count != null)
                count++;
            else
                count = 0;
            hashOfByte.put(value, count);
        }

        boolean first = true;
        int min = 0;
        for (int amountCounts : hashOfByte.values()) {
            if (first) {
                min = amountCounts;
                first = false;
            }
            if (min > amountCounts) {
                min = amountCounts;
            }
        }

        for (Map.Entry<Integer, Integer> pair : hashOfByte.entrySet()) {
            if (min == pair.getValue()) {
                System.out.print(" " + pair.getKey());
            }
        }

        fileInputStream.close();
    }
}
