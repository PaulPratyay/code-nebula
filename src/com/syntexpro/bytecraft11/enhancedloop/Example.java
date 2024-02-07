package com.syntexpro.bytecraft11.enhancedloop;

public class Example {
    public static void main(String[] args) {

        int[] array = {12, 13, 14, 44};
        int total = 0;

        for (int i : array) {
            total = total + i;
        }
        System.out.println("Total = " + total);
    }
}
