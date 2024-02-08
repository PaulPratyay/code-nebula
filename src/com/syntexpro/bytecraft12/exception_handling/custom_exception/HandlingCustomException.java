package com.syntexpro.bytecraft12.exception_handling.custom_exception;

public class HandlingCustomException {

    public static void main(String[] args) {

        try {
            System.out.println("Division Result = " + division(12, 0));
        } catch (ArithmeticException e){
            System.out.println(e);
        }


    }

    public static double division(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Dividing by 0 is undefined");
        }
        return a / b;
    }

}
