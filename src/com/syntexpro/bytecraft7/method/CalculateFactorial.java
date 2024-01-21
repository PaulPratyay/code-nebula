package com.syntexpro.bytecraft7.method;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {

        Scanner calculateFactorial = new Scanner(System.in);

        System.out.println("Enter a number you want factorial for: ");
        int number = calculateFactorial.nextInt();
        System.out.println("Factorial of " + number + '\u0021' + " = " + calculateFactorial(number));

    }

    public static int calculateFactorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial *= i;
        }
        return factorial;
    }
}
