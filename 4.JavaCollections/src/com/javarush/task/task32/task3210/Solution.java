package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];

        long position = Integer.parseInt(args[1]);

        String text = args[2];

        try(RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            byte[] buf = new byte[text.length()];
            raf.seek(position);
            raf.read(buf, 0, buf.length);
            String s1 = convertByteToString(buf);
            String s2 = s1.equals(text) ? "true" : "false";
            raf.seek(raf.length());
            raf.write(s2.getBytes());
        }

    }

    public static String convertByteToString (byte readBytes[]) {
        return new String(readBytes);
    }
}
