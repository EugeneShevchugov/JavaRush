package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanSwim, CanRun {
        public void swim() {
            System.out.println("test");
        }

        public void run() {
            System.out.println("testing");
        }

    }

    public class Duck implements CanRun, CanSwim, CanFly {
        public void run() {
            System.out.println("test");
        }

        public void fly() {
            System.out.println("testing");
        }

        public void swim() {
            System.out.println("test");
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
            System.out.println("test");
        }

        public void swim() {
            System.out.println("testing");
        }
    }

    public class Airplane implements CanRun, CanFly {
        public void run() {
            System.out.println("test");
        }

        public void fly() {
            System.out.println("testing");
        }
    }
}
