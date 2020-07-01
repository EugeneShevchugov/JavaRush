package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            String filename = reader.readLine(); // "c:/tmp/data.txt"; // тут вводим имя файла
            FileInputStream filestream = new FileInputStream(filename); // создаем новый поток чтения

            if (filestream.available() < 1000){  // если кол-во байтов меньше 1000
                filestream.close(); // закрыть поток
                throw new DownloadException(); // бросить исключение
            }
        } while (true); // вводить новые имена пока файл не будет меньше 1000

    }

    public static class DownloadException extends Exception {

    }
}
