package com.syntexpro.bytecraft5.loop.forloop;

import java.util.Scanner;

public class PN {
    public static void main(String[] args) {
        /*
        A prime number is a natural number greater than 1 that has only two factors: 1 and the number itself.
        This means that a prime number cannot be divided by any other natural number except 1 and itself.
        For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
         */

        Scanner primeNumber = new Scanner(System.in);

        System.out.println("Enter a number up to which the prime number should be displayed: ");
        int num = primeNumber.nextInt();

        System.out.println("Prime numbers up to " + num + ":");


        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(+i + ", ");
            }
        }
        System.out.println();
    }
}
