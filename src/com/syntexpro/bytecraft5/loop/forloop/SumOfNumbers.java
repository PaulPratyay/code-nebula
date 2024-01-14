package com.syntexpro.bytecraft5.loop.forloop;

public class SumOfNumbers {
    public static void main(String[] args) {

        //This program calculates the sum of numbers between 1 and 100

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println("Summation of numbers between 1 and 100: " + sum);
    }
}
