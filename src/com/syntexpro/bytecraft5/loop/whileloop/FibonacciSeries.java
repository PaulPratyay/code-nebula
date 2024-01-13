package com.syntexpro.bytecraft5.loop.whileloop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        /*
        A Fibonacci Series is a sequence of numbers that starts with 0 and 1, and each subsequent
        number is the sum of the two previous numbers. For example, the first 10 numbers of the
        Fibonacci Series are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34;
         */

        Scanner fibonacciSeries = new Scanner(System.in);

        System.out.println("Enter the first 'n' numbers of the fibonacci series: ");
        int n = fibonacciSeries.nextInt();

        int firstTerm = 0, secondTerm = 1, nextTerm;
        int i = 1;

        System.out.println("The first " + n + " numbers of the Fibonacci Series are as follows: ");

        while (i <= n) {

            System.out.print(firstTerm + ", ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;


        }
    }
}
