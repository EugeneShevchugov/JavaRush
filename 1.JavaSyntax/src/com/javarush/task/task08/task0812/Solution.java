package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

    }
}