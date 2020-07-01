package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Petr", 12, "Govno");
        Man man2 = new Man("Vasya", 15, "TOjeGovno");
        Woman w1 = new Woman("Tanya", 18, "Wlyha");
        Woman w2 = new Woman("EweTanya", 18, "TojeWluha");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name) {
            this.name = name;

        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name) {
            this.name = name;

        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
}
