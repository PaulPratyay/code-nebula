package com.syntexpro.bytecraft4.conditionalstatements;

public class IfElseifElseStatement {
    public static void main(String[] args) {

        /*
        -> Similar to if-else statement;
        -> There will just be more 'else if' statements for more comparisons;
        -> It will only execute the code where it will first find the condition is 'true'
        -> If all conditions are 'false' it will simply execute the 'else' block;
        -> Again, there will be no condition in 'else block'
         */

        int age = 18;

        if (age >= 18) {
            System.out.println("Adult: Drive, Vote");
        } else if ((age >= 13) && (age <= 17)) {
            System.out.println("Teenager: You need parent authorization to drive");
        } else if ((age >= 10) && (age <= 12)) {
            System.out.println("Child: You cannot drive");
        } else {
            System.out.println("Age is not appropriate");
        }

        int score = 1000;

        if (score < 5000 && score > 1000) {
            System.out.println("You score is less than 5000 but greater than 1000");
        } else if (score < 4000 && score > 1000) {
            System.out.println("You score is less than 4000 but greater than 1000");
        } else if (score < 3000 && score > 1000) {
            System.out.println("Your score is less than 3000 but greater than 1000");
        } else if (score < 2000 && score > 1000) {
            System.out.println("Your score is less than 2000 but greater than 1000");
        } else {
            System.out.println("Your score is 1000");
        }
    }
}
