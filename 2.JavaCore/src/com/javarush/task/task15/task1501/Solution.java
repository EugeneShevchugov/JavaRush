package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        public boolean isMovable() {
            return false;
        }

        public Clothes getAllowedAction(String name) {
            name = "Pidoras";
            Clothes clothes = new Clothes();
            return clothes;
        }

        public Clothes getAllowedAction() {
            return new Clothes();
        }
    }
}