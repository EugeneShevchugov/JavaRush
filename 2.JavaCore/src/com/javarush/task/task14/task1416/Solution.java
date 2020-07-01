package com.javarush.task.task14.task1416;

/* 
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {
        public void swim() {

        }
        public Orca getCurrentAnimal() {
            Orca orca = new Orca();
            return orca;
        }
    }

    static class Whale extends OceanAnimal {
        public void swim() {

        }
        public Whale getCurrentAnimal() {
            Whale whale = new Whale();
            return whale;
        }
    }

    static class Otter implements Walkable, Swimmable {
        public void swim() {

        }
        public void walk() {

        }
        public Otter getCurrentAnimal() {
            Otter otter = new Otter();
            return otter;
        }
    }
}
