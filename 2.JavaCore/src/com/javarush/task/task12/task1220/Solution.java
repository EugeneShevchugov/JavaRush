package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    interface CanSwim {
        public void swim();
    }

    interface CanRun {
        public void run();
    }

    public abstract class Human implements CanSwim, CanRun {

    }
}
