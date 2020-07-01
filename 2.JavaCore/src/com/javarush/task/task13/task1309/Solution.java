package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        default Double speed() {
            double a = 0;
            return a;
        }
    }

    interface CanFly extends CanMove {
        default Double speed(CanFly fly) {
            double a = 0;
            return a;
        }
    }
}