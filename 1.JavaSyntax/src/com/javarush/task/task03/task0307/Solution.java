package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg Troll = new Zerg();
        Troll.name = "Troll";
        Zerg Warlord = new Zerg();
        Warlord.name = "Warlord";
        Zerg Meepo = new Zerg();
        Meepo.name = "Meepo";
        Zerg Test = new Zerg();
        Test.name = "Test";
        Zerg Test2 = new Zerg();
        Test2.name = "Test2";
        Protoss Pizdoz = new Protoss();
        Pizdoz.name = "Pizdoz";
        Protoss Pizdolis = new Protoss();
        Pizdolis.name = "Pizdolis";
        Protoss Testachit = new Protoss();
        Testachit.name = "Test";
        Terran t1 = new Terran();
        t1.name = "t1";
        Terran t2 = new Terran();
        t2.name = "t2";
        Terran t3 = new Terran();
        t3.name = "t3";
        Terran t4 = new Terran();
        t4.name = "t4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
