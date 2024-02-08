package com.syntexpro.bytecraft12.exception_handling.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {

        try {

            String nullString = null;
            System.out.println("Length of the string: " + nullString.length());
        } catch (NullPointerException e) {
            System.out.println("Cannot access the 'length()' method on a null reference");
        }
    }
}
