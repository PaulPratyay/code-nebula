package com.syntexpro.bytecraft12.exception_handling.unchecked;

/*
    -> There may be a scenario where you don't know what kind of exception you might encounter;
    -> The best way is to simply use 'Exception' at that time;
    -> And also tt is a good practice to use variable 'e' while using any kind of exception;
 */

import java.util.Scanner;

public class ParentExceptionExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int num1 = sc.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);
        } catch (
                Exception e) {                             // Here, I have used Exception instead of ArithmeticException;
            System.out.println("Something went wrong");
        }
    }
}
