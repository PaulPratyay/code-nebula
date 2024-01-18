package com.syntexpro.bytecraft5.loop.forloop;

import java.util.Scanner;

public class CompositeNumberOrPrimeNumber {
    public static void main(String[] args) {

        /*
        This program will tell you if a given number is a prime number or a composite number;
         */

        Scanner primeOrComposite = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = primeOrComposite.nextInt();

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter > 2) {
            System.out.println(+number + " is a composite number");
        }else {
            System.out.println(+number + " is a prime number");
        }
    }
}
