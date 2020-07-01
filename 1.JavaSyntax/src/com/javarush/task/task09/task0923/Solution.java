package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine().replace(" ", "");
        String vowel = "";
        String unvowel = "";
        char[] strArray = s.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (isVowel(strArray[i])) {
                vowel+= strArray[i];
                vowel+= " ";
            }
            else {
                unvowel+= strArray[i];
                unvowel+= " ";
            }
        }
        System.out.println(vowel);
        System.out.println(unvowel);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}