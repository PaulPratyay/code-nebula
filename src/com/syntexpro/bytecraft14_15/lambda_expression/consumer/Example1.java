package com.syntexpro.bytecraft14_15.lambda_expression.consumer;

import java.util.function.Consumer;

/*
    -> Consumer is a functional interface in Java that represents an operation that accepts a single input argument and returns no result;
    -> It is part of the java.util.function package introduced in Java 8 as a part of the functional programming enhancements;
    -> It has a single abstract method called 'accept()', which specifies the operation to be performed on the input argument;
    -> This interface is commonly used in scenarios where you need to perform an action on each element of a collection, such as iterating over a list and performing some operation on each element;

    -> Lambda expressions can be used to implement the 'accept()' method of the 'Consumer' interface concisely;
    -> This allows for more compact and expressive code when working with operations that accept input arguments;
 */

public class Example1 {
    public static void main(String[] args) {

        // Defining a Consumer to print a string

        Consumer<String> printString = str -> System.out.println("Printing: " + str);

        // Using the Consumer to print a string

        printString.accept("Consumer is a functional interface in Java");
    }
}
