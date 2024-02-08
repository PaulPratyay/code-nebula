package com.syntexpro.bytecraft12.exception_handling.finally_block;

// When an exception occurs but not handled by the catch block

public class Example2 {
    public static void main(String[] args) {

        // Here, the code will throw ArithmeticException

        try {
            int data = 18 / 0;
            System.out.println("Data = " + data);
        } catch (NullPointerException e) {          // Here, catch block can only handle NullPointerException
            System.out.println(e);
        }

        // finally block is executed regardless of the exception occurred or not

        finally {
            System.out.println("finally block is always executed");
        }

        // This will not be executed

        System.out.println("Code outside try-catch-finally block");
    }
}
