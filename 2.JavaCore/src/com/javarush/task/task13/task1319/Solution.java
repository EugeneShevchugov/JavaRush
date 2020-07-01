package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        String s = "";
        while (!s.equals("exit")) {
            s = console.readLine();
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        console.close();
        bufferedWriter.close();
    }
}
