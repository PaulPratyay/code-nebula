package com.syntexpro.bytecraft5.loop.whileloop;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner oddNumbers = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int range = oddNumbers.nextInt();

        int number = 0;

        while (number <= range) {

            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
