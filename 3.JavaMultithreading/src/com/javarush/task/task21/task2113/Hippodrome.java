package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public static Hippodrome game;

    public Hippodrome (List<Horse> horses) {
        this.horses = horses;
        horses = new ArrayList<Horse>();
    }

    public Horse getWinner(){
        return horses.stream()
                .max((h1, h2) -> Double.compare(h1.getDistance(), h2.getDistance()))
                .get();
    }
    public void printWinner(){
        System.out.printf("Winner is %s!%n",getWinner().getName());
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(Arrays.asList(new Horse("Belka", 3, 0), new Horse("Strelka", 3, 0), new Horse("Et", 3, 0)));
        game.run();
        game.printWinner();
    }
}
