package com.syntexpro.bytecraft4.ternaryoperator;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner oddEven = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = oddEven.nextDouble();

        String s = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(s);


    }
}
