package com.syntexpro.bytecraft6.continuestatement;

public class ContinueStatement {
    public static void main(String[] args) {

        /*
        ->  'continue' is a keyword in java;
        ->  The 'continue' statement is used to skip the rest of the code inside a loop for the current iteration
            and move on to the next iteration;
         */

        //using 'for' loop
        System.out.println("Using 'for' loop");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue; // It skipped the code execution inside this block and moved to the next iteration;
            }
            System.out.println("Iteration " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Num " + i);
        }

        //Using 'while' loop;

        System.out.println("Using 'while' loop");

        int number = 1;

        while (number <= 5) {
            if (number == 4) {
                number++;
                continue;
            }
            System.out.println("Number " + number);
            number++;
        }

        //using 'do-while' loop;

        System.out.println("Using 'do-while' loop");

        int counter = 1;

        do {
            if (counter == 4) {
                counter++;
                continue;
            }
            System.out.println("Counter " + counter);
            counter++;
        } while (counter <= 5);

    }


}
