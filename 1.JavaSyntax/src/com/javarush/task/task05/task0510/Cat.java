package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;
    public void initialize (String name) {
        this.name = name;
        this.weight = 10;
        this.age = 5;
        this.color = "Green";
        this.address = null;
    }
    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Red";
        this.address = null;
    }
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 15;
        this.color = "Blue";
        this.address = null;
    }
    public void initialize (int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.name = null;
        this.age = 5;
        this.address = null;
    }
    public void initialize (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 18;
    }

    public static void main(String[] args) {

    }
}
