package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    String color;
    int age;
    int weight;
    String address;
    public Cat(String name) {
        this.name = name;
        this.address = null;
        this.age = 10;
        this.weight = 15;
        this.color = "Red";
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight = 15;
        this.color = "Red";
    }
    public Cat(int weight, String color) {
        this.name = name;
        this.address = null;
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address) {
        this.name = null;
        this.address = address;
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
