package com.syntexpro.bytecraft5.loop.forloop;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Multiplication table for 5

        System.out.println("\\5 Times Table\\");
        int multiplier = 5;

        for (int i = 1; i <= 12; i++) {
            System.out.println(+multiplier + " * " + i + " = " + (multiplier * i));
        }

        //Multiplication table for 12

        System.out.println("\\12 Times Table\\");
        int multiplier12 = 12;

        for (int i = 1; i <= 12; i++) {
            System.out.println(+multiplier12 + " * " + i + " = " + (multiplier12 * i));
        }

    }
}
