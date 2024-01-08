package com.syntexpro.bytecraft4.conditionalstatements;

public class IfElseStatement {
    public static void main(String[] args) {

        /*
        -> If the condition in 'if (condition)' is 'true', the code inside that block will be executed;
        -> If the condition in 'if (condition) is 'false', the code inside the 'else' block will be executed;
        -> There will be no condition in 'else' block;
         */

        int age = 20;

        if (age >= 18) {
            System.out.println("Adult: Drive, Vote");
        } else {
            System.out.println("Age is below 18 years");
        }

        String username = "Paul", password = "12345";

        if ((username.equals("Pal")) && (password.equals("12345"))) {
            System.out.println("Welcome to Paul's World");
        } else {
            System.out.println("Please enter your correct Username and Password");
        }

        if (10 > 5) {
            System.out.println("Welcome to Java Programming");
        } else {
            System.out.println("10 is greater than 5");
        }

        if (15 > 30) {
            System.out.println("Java");
        } else {
            System.out.println("Java is platform independent language");
        }

        int score = 1000;

        if (score == 1000) {
            System.out.println("Your score is 1000");
        } else {
            System.out.println("You are here");
        }

        if (score < 5000) {
            System.out.println("Your score is less than 5000");
        } else {
            System.out.println("You are here");
        }

        if (score <= 5000) {
            System.out.println("Your score is less than or equal to 5000");
        } else {
            System.out.println("You are here");
        }

        if (score >= 5000) {
            System.out.println("Your score is greater or equal to 5000");
        } else {
            System.out.println("You are here");
        }
    }
}
