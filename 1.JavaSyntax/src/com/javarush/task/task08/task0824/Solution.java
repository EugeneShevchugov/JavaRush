package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human childBoy = new Human("Son", true, 10); //Ошибки нет.
        Human childDoch = new Human("Doch", false, 16);
        Human childDroch = new Human("Droch", false, 17);
        Human daddy = new Human("Daddy", true, 37, childBoy, childDoch, childDroch); //Передача объекта сына и дочь
        Human mommy = new Human("Mommy", false, 37, childBoy, childDoch, childDroch); //Передача объекта сына и дочь
        Human grandFather = new Human("Дед", true, 65, daddy); //Передача объекта отца, как сына у деда
        Human grandFather2 = new Human("Дед2", true, 655, mommy); //Передача объекта отца, как сына у деда
        Human grandMother = new Human("Баба", false, 45, daddy); //Передача объекта отца, как сына у деда
        Human grandMother2 = new Human("Баба2", false, 41, mommy); //Передача объекта отца, как сына у деда
        System.out.println(grandFather.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother.toString());
        System.out.println(grandMother2.toString());
        System.out.println(daddy.toString());
        System.out.println(mommy.toString());
        System.out.println(childBoy.toString());
        System.out.println(childDoch.toString());
        System.out.println(childDroch.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human ...  human) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, human);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }

            return text;
        }
    }

}
