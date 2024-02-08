package com.syntexpro.bytecraft12.exception_handling.unchecked;

/*
    -> Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.,;
    -> The core advantage of exception handling is to maintain the normal flow of the application;
    -> An exception normally disrupts the normal flow of the application, that is why we need to handle exception;
 */

import java.util.Scanner;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {

        Scanner divideByZero = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int num1 = divideByZero.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int num2 = divideByZero.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Dividing a number by zero is undefined");
        }
    }
}
