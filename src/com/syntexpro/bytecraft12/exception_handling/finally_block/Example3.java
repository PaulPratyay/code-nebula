package com.syntexpro.bytecraft12.exception_handling.finally_block;

// When an exception occurs and is handled by the catch block

public class Example3 {
    public static void main(String[] args) {

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(5 / i);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is undefined");
        }

        // executes regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("Outside try-catch-finally block");
    }
}
