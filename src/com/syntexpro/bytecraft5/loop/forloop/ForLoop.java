package com.syntexpro.bytecraft5.loop.forloop;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Java");
        }

        //Print Even Numbers from 1 to 20

        System.out.println("Printing even numbers between 1 to 20: ");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(+i + ", ");

        }
        System.out.println();

        //Print number 1 to 5

        System.out.println("Printing numbers from 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(+i + ", ");
        }
        System.out.println();

        //Print Odd Numbers 1 to 20

        System.out.println("Printing odd numbers between  1 to 20: ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(+i + ", ");
        }
        System.out.println();
    }
}
