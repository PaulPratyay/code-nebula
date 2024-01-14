package com.syntexpro.bytecraft5.loop.forloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        A prime number is a natural number greater than 1 that has only two factors: 1 and the number itself.
        This means that a prime number cannot be divided by any other natural number except 1 and itself.
        For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
         */

        Scanner primeNumber = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = primeNumber.nextInt();

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}
