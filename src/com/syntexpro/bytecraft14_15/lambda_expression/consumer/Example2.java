package com.syntexpro.bytecraft14_15.lambda_expression.consumer;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {

        // Using lambda expression

        System.out.println("Using Lambda Expression: ");

        List<String> continents = List.of("Asia", "Africa", "North America", "South America", "Antarctica", "Europe", "Australia");

        Consumer<String> totalContinents = numberOfContinents -> System.out.println(numberOfContinents);
        continents.forEach(totalContinents);
        System.out.println();

        // Another way to use lambda expression

        continents.forEach(System.out::println);
        System.out.println();

        /*
        -> Here, `Consumer<String>` is used to define a lambda expression that takes a `String` argument (representing a continent from continents list) and prints it to the console using `System.out.println()`;
         -> This lambda expression is then passed as an argument to the `forEach` method, which applies the operation defined by the `Consumer` to each element in the list;
         */

        // Using method reference

        System.out.println("Using Method Reference: ");

        Consumer<String> continentsInTotal = System.out::println;
        continents.forEach(continentsInTotal);
        System.out.println();
    }
}
