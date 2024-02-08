package com.syntexpro.bytecraft12.exception;

/*
    -> In Java, an exception is an event that disrupts the normal flow of the program;
    -> It is an object which is thrown at runtime;

The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses:

        -> Exception
        -> Error

Exception has two types:
    1) Runtime Exception/Unchecked Exception
        -> ArithmeticException
        -> IllegalArgumentException
        -> NullPointerException
        -> NumberFormatException
        -> IndexOutOfBoundException
            -> ArrayIndexOutOfBoundsException
            -> StringIndexOutOfBoundsException

     2) IOException/Checked Exception
        -> FileNotFoundException
        -> SocketException

Error can be as follows:

        -> SocketOverFlowError
        -> VirtualMachineError
        -> OutOfMemoryError
 */

import java.util.Scanner;

public class WhatIsException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a whole number to divide: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int num2 = sc.nextInt();

        int result = num1 / num2;

        System.out.println("Result = " + result);

        /*
         The above example throws an ArithmeticException if it is divided by 0;
         */
    }


}

