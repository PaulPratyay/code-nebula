package com.syntexpro.javaclass2.operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        /*
        Assignment Operators: ( = , += , +- , *= , /= )
         */

        //Shorthand Operators
        int a = 50, b = 10;
        a += b;
        System.out.println("a = " + a);
        b -= b;
        System.out.println("b = " + b);
        a *= 5;
        System.out.println("a = " + a);
        a /= 30;
        System.out.println("a = " + a);
    }
}
