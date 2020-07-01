package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Date data = new Date();
        SimpleDateFormat test = new SimpleDateFormat();
        System.out.println(new SimpleDateFormat("MMM d, y", Locale.ENGLISH).format(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(new BufferedReader(new InputStreamReader(System.in)).readLine())).toUpperCase());
    }
}
