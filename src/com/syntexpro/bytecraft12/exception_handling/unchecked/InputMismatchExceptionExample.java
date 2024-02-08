package com.syntexpro.bytecraft12.exception_handling.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");

        try {
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println(name + " is eligible to vote and drive");
            } else {
                System.out.println(name + " is below 18 years");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter the age correctly");
        }
    }
}
