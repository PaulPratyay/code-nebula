package com.syntexpro.homework.operators;

public class Question3 {
    public static void main(String[] args) {

        int x, y, z;

        x = y = z = 2;

        x += y;                 // x = 4
        y -= z;                // y = 0
        z /= (x + y);         //0

        System.out.println(x + " " + y + " " + z);     // 4 0 0
    }
}
