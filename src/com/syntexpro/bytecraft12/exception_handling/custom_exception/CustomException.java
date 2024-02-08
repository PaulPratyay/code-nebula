package com.syntexpro.bytecraft12.exception_handling.custom_exception;

public class CustomException {
    public static void main(String[] args) {

        System.out.println("Division result = " + division(108, 0));


    }

    public static double division(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Dividing by 0 is undefined");
        }
        return a / b;
    }
}
