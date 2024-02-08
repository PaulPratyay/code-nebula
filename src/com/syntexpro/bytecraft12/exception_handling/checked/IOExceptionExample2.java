package com.syntexpro.bytecraft12.exception_handling.checked;

import java.io.IOException;

public class IOExceptionExample2 {
    public static void main(String[] args) {

        try {
            throw new IOException("Simulating IOException");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
        System.out.println("After try-catch bock");
    }
}
