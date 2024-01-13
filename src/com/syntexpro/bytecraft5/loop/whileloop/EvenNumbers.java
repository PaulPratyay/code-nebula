package com.syntexpro.bytecraft5.loop.whileloop;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        //This is a program to print only even numbers from 0 till the number provided by the user;

        Scanner evenNumbers = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int range = evenNumbers.nextInt();

        int number = 0;

        while (number <= range) {

            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
