package com.syntexpro.javaclass2.operators;

public class ArithmeticBinaryOperators {
    public static void main(String[] args) {

        /*
        Arithmetic Operators: (+ , - , * , / , %)
         */
        int a = 50, b = 20;
        int sum, sub, mul, rem;
        double div;
        //BODMAS -> Brackets,Orders,Division,Multiplication,Addition,Subtraction
        div = (double) a / b;
        mul = a * b;
        sum = a + b;
        sub = a - b;
        rem = a % b;

        System.out.println("Division: " + div);
        System.out.println("Multiplication: " + mul);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Remainder: " + rem);

        double bodmas = (a * b) + ((double) a / b) - a + b * ((double) b / a);
        System.out.println(bodmas);

    }
}
