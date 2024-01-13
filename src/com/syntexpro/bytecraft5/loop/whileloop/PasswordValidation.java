package com.syntexpro.bytecraft5.loop.whileloop;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        /*
        This program ensures that the user enters a password with a minimum length of
        8 characters before proceeding. The loop will repeat until a valid password is provided
         */

        Scanner passwordValidation = new Scanner(System.in);

        boolean validPassword = false; // This will help to control the while loop

        while (!validPassword) {

            System.out.println("Enter a password (minimum 8 characters): ");
            String password = passwordValidation.nextLine();

            if (password.length() >= 8) {        // 'while' loop continues to execute as long as 'validPassword' is 'false'
                System.out.println("Password Accepted");
                validPassword = true;
            } else {
                System.out.println("Password must be a minimum of 8 characters. Please try again later");
            }
        }
        passwordValidation.close();  //closes the 'Scanner' to avoid resource leaks
    }
}
