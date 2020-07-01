package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String sername;
        private String address;
        private int age;
        private long number;
        private double iq;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
            System.out.println("Привет, мое Имя - " + name);
        }

        public Human(String name, String sername) {
            this.name = name;
            this.sername = sername;
            System.out.println("Привет, мое имя - " + name + " ,фамилия - " + sername);
        }

        public Human(String name, String sername, int age) {
            this(name, sername);
            this.age = age;
            System.out.println("Здрасьте дасвидания");
        }

        public Human(String name, String sername, int age, String address) {
            this(name, sername, age);
            this.address = address;
            System.out.println("Бич мафака");
        }
        public Human(String name, String sername, int age, String address, long number) {
            this(name, sername, age, address);
            this.number = number;
            System.out.println("Мой номер - " + number);
        }
        public Human(String name, String sername, int age, String address, long number, double iq) {
            this(name, sername, age, address, number);
            this.iq = iq;
            System.out.println("Мой iq = " + iq);
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("test");
        }
        public Human(int age, long number) {
            this.age = age;
            this.number = number;
            System.out.println(number);
        }
        public Human(double iq, long number) {
            this.iq = iq;
            this.number = number;
            System.out.println(iq);
        }
    }
}
