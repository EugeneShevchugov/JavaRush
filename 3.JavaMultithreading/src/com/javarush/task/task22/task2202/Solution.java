package com.javarush.task.task22.task2202;


/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Вася хватит уже гулять на улице!"));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int spaceindex = string.indexOf(" ") + 1;
        char chars[] = string.toCharArray();
        int countspace = 0;
        int lastspaceindex = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == ' ') {
                countspace++;
                if (countspace == 4) {
                    lastspaceindex = string.length();
                }
                else if (countspace == 5) {
                    lastspaceindex = i;
                    break;
                }
            }
        }
        if (countspace < 4) {
            throw  new TooShortStringException();
        }
        return string.substring(spaceindex, lastspaceindex);
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
