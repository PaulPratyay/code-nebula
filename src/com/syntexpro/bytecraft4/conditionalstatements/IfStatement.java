package com.syntexpro.bytecraft4.conditionalstatements;

public class IfStatement {
    public static void main(String[] args) {

        /*
        -> if statement is used for single comparisons only;
        -> the code inside the block {.....}, will only be executed if the condition in 'if (condition)' is 'true';
        -> It will not enter the block {....}, and the code won't be executed if the condition in 'if (condition)' is 'false';
         */

        String name = "Pratyay Paul";

        if (name.equals("Pratyay Paul")) {
            System.out.println("Correct User Name");
        }
        if (name.equals("Pratyay")) {
            System.out.println("Surname not provided");  // This won't be printed because the condition is not 'true';
        }

        int a = 10;

        if (a == 10) {
            System.out.println("You entered the correct input.");
        }
        if (a == 5) {
            System.out.println("Inout not correct"); // Condition 'false', will not execute the code
        }

        if (100 > 50) {
            System.out.println("100 is the biggest number");
        }
        if (25 < 50) {
            System.out.println("25 is the smallest number");
        }
        if (25 > 100) {
            System.out.println("Wrong Condition");
        }
        if (25 <= 50) {
            System.out.println("25 is smaller than 50 but not equal to 50");
        }
        if (100 >= 75) {
            System.out.println("100 is greater than 75 but not equal to 75");
        }
        if (100 >= 450) {
            System.out.println("100 is not greater or equal to 450");
        }
        if (45 <= 25) {
            System.out.println("45 is not smaller or equal to 25");
        }

        /*
        When the condition is 'false', it comes out of the block and nothing is usually printed. It is blank.
         */
    }
}
