package com.syntexpro.homework.conditionalstatements;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        //Program to find if a number is positive or negative

        Scanner positiveNegative = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = positiveNegative.nextDouble();

        if (num > 0) {
            System.out.println(+num + " is a positive number");
        } else if (num < 0) {
            System.out.println(+num + " is a negative number");
        } else {
            System.out.println(+num + " is Zero");
        }

    }
}
