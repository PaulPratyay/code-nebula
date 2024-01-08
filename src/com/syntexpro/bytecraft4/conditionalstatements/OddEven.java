package com.syntexpro.bytecraft4.conditionalstatements;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner oddEven = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = oddEven.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
