package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int width;
    int left;
    int height;
    public void initialize(int top, int width, int left, int height) {
        this.height = height;
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize(int top, int left) {
        this.height = 0;
        this.top = top;
        this.left = left;
        this.width = 0;
    }
    public void initialize(int top, int width, int left) {
        this.height = width;
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize() {
        this.width = width;
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
