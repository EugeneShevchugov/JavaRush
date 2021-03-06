package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        key = reader.readLine();
        while (key.equals("user") || key.equals("proger") || key.equals("loser") || key.equals("coder")) {
            if (key.equals("user")) {
                person = new Person.User();
            }
            if (key.equals("proger")) {
                person = new Person.Proger();
            }
            if (key.equals("loser")) {
                person = new Person.Loser();
            }
            if (key.equals("coder")) {
                person = new Person.Coder();
            }

            doWork(person); //вызываем doWork
            key = reader.readLine();

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }

    }
}
