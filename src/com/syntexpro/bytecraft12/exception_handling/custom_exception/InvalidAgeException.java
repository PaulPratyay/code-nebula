package com.syntexpro.bytecraft12.exception_handling.custom_exception;

import java.util.Scanner;

public class InvalidAgeException extends Exception {

    // Calling the constructor of parent Exception

    public InvalidAgeException(String invalidAge) {
        super(invalidAge);
    }

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Your age is below 18 years. You are not eligible to vote");      // throw an object of user defined exception
        } else {
            System.out.println("Congratulations! You are eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(17);           // calling the method
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception Occurred: " + e);
        }

        System.out.println("Outside try-catch block");


    }
}
