package com.syntexpro.bytecraft12.exception_handling.finally_block;

// When an exception does not occur

import java.io.File;

public class Example1 {
    public static void main(String[] args) {

        //Here code inside the try block  do not throw any exception

        try {
            int data = 108 / 2;
            System.out.println("Data = " + data);
        } catch (NullPointerException e) {          // catch block won't be executed
            System.out.println(e);
        }

        // finally block executes regardless of exception occurred or not

        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Outside try-catch-finally block");
    }
}
