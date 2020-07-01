package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.net.BindException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
