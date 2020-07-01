package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream comp;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream e) throws FileNotFoundException {
        super(fileName);
        comp = e;

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        comp.write(b,off,len);
    }

    @Override
    public void write(int b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        comp.write(b);
    }

    @Override
    public void flush() throws IOException {
        comp.flush();
    }

    @Override
    public void close() throws IOException {
        comp.flush();
        String s = "JavaRush © All rights reserved.";
        write(s.getBytes());
        comp.close();
    }
}
