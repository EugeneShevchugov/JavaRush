package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat c1 = new Cat("Vasya", 12, 3, 100);
        Cat c2 = new Cat("Tasya", 11, 3, 100);
        Cat c3 = new Cat("Basya", 10, 3, 100);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}