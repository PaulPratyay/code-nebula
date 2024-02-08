package com.syntexpro.bytecraft12.exception_handling.unchecked;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {

        try {

            int number = Integer.parseInt("108k");
            System.out.println(number);

            for (int i = 5; i >= 0; i--) {
                System.out.println(5 / i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse the given string");
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0 is undefined");
        }
    }
}
