package com.syntexpro.bytecraft5.loop.whileloop;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        The 'while' loop is used when the number of iterations is not known in advance,
        and the loop continues as long as a specified condition is true.
         */

        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        int num = 1;

        while (num <= 25) {
            System.out.println(num);
            num += 2;
        }

        int a = 0;

        while (a <= 20) {
            System.out.println(a);
            a += 2;
        }

        int name = 1;

        while (name <= 5) {
            System.out.println("Pratyay Paul");
            name++;
        }


    }
}
