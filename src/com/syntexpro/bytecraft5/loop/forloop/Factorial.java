package com.syntexpro.bytecraft5.loop.forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        /*
        A factorial is a mathematical operation that multiplies a positive integer by all the smaller positive integers.
        For example, the factorial of 5 is written as 5! and equals 5 × 4 × 3 × 2 × 1 = 120.
        The factorial of 0 is defined as 1. The factorial symbol is an exclamation mark (!).
         */

        Scanner factorialProgram = new Scanner(System.in);

        System.out.println("Enter a number to calculate it's factorial: ");
        int number = factorialProgram.nextInt();


        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
