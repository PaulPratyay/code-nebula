package com.syntexpro.bytecraft6.dowhileloop;

public class DoWhileLoop {
    public static void main(String[] args) {

         /*
     The do-while loop is similar to the while loop, but it guarantees that the code block is
        executed at least once, as the condition is checked after the block.

        The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top.
        Therefore, the statements within the do block are always executed at least once,
     */


        int counter = 1;

        do {
            System.out.println("Java");
            counter++;
        } while (counter <= 0); // Here, 1 is not <= 0; Since, in do-while condition is checked at the last, 'Java' is printed at least once;


        //Print 'Docker' 5 times;

        int docker = 1;

        do {
            System.out.println("Docker");
            docker++;
        } while (docker <= 5);

        //Print even numbers between 0 and 20;

        int evenNum = 2;

        System.out.print("Even numbers between 0 and 20: ");

        do {
            System.out.print(+ evenNum + ", ");
            evenNum += 2;
        } while (evenNum <= 20);

        System.out.println();

        //Print odd number between 0 and 15;

        int oddNum = 1;

        System.out.print("Odd numbers between 0 and 15: ");

        do {
            System.out.print(+ oddNum + ", ");
            oddNum += 2;
        } while (oddNum <= 20);
    }


}
