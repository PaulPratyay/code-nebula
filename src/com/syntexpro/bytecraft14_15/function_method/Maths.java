package com.syntexpro.bytecraft14_15.function_method;

import java.util.function.Function;

public class Maths {

    // Creating method using OOP Concept

    static int addition(int a, int b) {
        return a + b;
    }

    static int incrementByOne(int n) {
        return n + 1;
    }

    // Creating method using Function Method

    static Function<Integer, Integer> incrementByOneUsingFunction = n -> n + 1;
    static Function<Integer, Integer> multiplicationUsingFunction = n -> n * 2;


    public static void main(String[] args) {

        //Calling method
        System.out.println("Addition method using OOP concept: " + addition(54, 54));
        System.out.println("Increment by one using OOP concept: " + incrementByOne(17) + "\n");

        //Calling Function
        System.out.println("Increment by one using Function: " + incrementByOneUsingFunction.apply(17));
        System.out.println("Multiplication using Function: " + multiplicationUsingFunction.apply(54));

        //Using two functions together
        System.out.println("Calculating using two functions: " + incrementByOneUsingFunction.andThen(multiplicationUsingFunction).apply(8));


    }
}
