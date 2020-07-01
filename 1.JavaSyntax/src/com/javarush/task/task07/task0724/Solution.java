package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human father = new Human("Макс", true, 50);
        Human mother = new Human("Аня", true, 40);
        Human gf = new Human("Эдвин", true, 100);
        Human gm = new Human("Лера", true, 120);
        Human son = new Human("Володя", true, 18, father, mother);
        Human dou = new Human("Дарья", true, 19,father,mother);
        Human uncle = new Human("Сэм", true, 25, gf, gm);
        Human aunt = new Human("Тетя", true, 27, gf, gm);
        Human sister = new Human("Сестра", true, 42, father, mother);
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(gf.toString());
        System.out.println(gm.toString());
        System.out.println(son.toString());
        System.out.println(dou.toString());
        System.out.println(uncle.toString());
        System.out.println(aunt.toString());
        System.out.println(sister.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.age = age;
            this.name = name;
            this.sex = sex;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}