package com.syntexpro.bytecraft6.breakstatement;

public class BreakStatement {
    public static void main(String[] args) {

        /*
        -> 'break' is a keyword in Java;
        ->  In Java, 'break' statement is used to terminate the execution of a loop or a switch statement prematurely;
        ->  When a 'break' statement is encountered inside a loop or switch, the program immediately exits that construct,
            and the control flow continues with the next statement following the loop or switch;
         */

        //Print 1 to 4, using 'for' loop when the condition is i <= 10

        System.out.println("Printing 1 to 4 using 'for' loop");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i);
            if (i == 4) {
                break; // Terminates when 'i' becomes 4;
            }
        }

        // Print 5 to 10, using 'while' loop when condition is num <= 15;

        System.out.println("Printing 5 to 10 using 'while' loop");

        int num = 5;

        while (num <= 15) {
            System.out.println("Num " + num);
            if (num == 10) {
                num++;
                break;
            }
            num++;

        }

        // Print 10 to 15 using 'do-while' loop, when condition is counter <= 20;

        System.out.println("Printing 10 to 15 using 'do-while' loop");

        int counter = 10;

        do {
            System.out.println("Counter " + counter);
            if (counter == 15) {
                break;
            }
            counter++;
        } while (counter <= 20);


    }
}
