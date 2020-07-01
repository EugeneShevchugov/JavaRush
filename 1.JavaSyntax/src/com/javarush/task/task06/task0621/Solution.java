package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String grandFather = sc.nextLine();
        String grandMother = sc.nextLine();
        String Father = sc.nextLine();
        String Mother = sc.nextLine();
        String daughter = sc.nextLine();
        String son = sc.nextLine();
        Cat gf = new Cat(grandFather);
        Cat gm = new Cat(grandMother);
        Cat f = new Cat(gf, Father);
        Cat m = new Cat(Mother, gm);
        Cat d = new Cat(daughter, m, f);
        Cat s = new Cat(son, m, f);
        System.out.println(gf);
        System.out.println(gm);
        System.out.println(f);
        System.out.println(m);
        System.out.println(d);
        System.out.println(s);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat sparent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(Cat sparent, String name) {
            this.sparent = sparent;
            this.name = name;
        }

        Cat(String name, Cat parent, Cat sparent) {
            this.name = name;
            this.parent = parent;
            this.sparent = sparent;
        }

        @Override
        public String toString() {
            if (parent == null && sparent == null)
                return "The cat's name is " + name + ", no mother , no father ";
            else if (sparent == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";
            else if (parent == null)
                return "The cat's name is " + name + ", no mother, father is " + sparent.name;
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + sparent.name;
        }
    }

}
