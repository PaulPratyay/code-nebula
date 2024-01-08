package com.syntexpro.bytecraft4.conditionalstatements;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner positiveNegativeZero = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num  = positiveNegativeZero.nextDouble();

        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number ");
        } else {
            System.out.println("Zero");
        }
    }
}
