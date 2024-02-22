package com.syntexpro.bytecraft14_15.lambda_expression.example8;

import java.util.List;
import java.util.function.Consumer;

public class LEInLoop {
    public static void main(String[] args) {

        List<String> names = List.of("Rebecca", "Addie", "Abdul", "Emily", "Ryan", "Lourdes", "Sophie");

        // Using traditional loop

        System.out.println("Using Traditional Loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Using for-each loop

        System.out.println();
        System.out.println("Using for-each loop: ");
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println();

        // Using lambda expression

        System.out.println("Using lambda expression: ");
        names.forEach(studentNames -> System.out.println(names));
        System.out.println();

        /*
        -> This lambda takes each element of the list as input (represented by studentNames);
        -> But inside the lambda, we are actually printing the entire list 'names' instead of the individual student names;
        -> So, for each name in the list, it prints the entire list;
        -> Here, 'forEach' is a method which is part of the 'Iterable' interface;
           -> It allows us to iterate over each element of a collection and perform an action for each element;
        -> The 'forEach' method takes a single parameter, which is a functional interface representing the action to be performed on each element;
           -> This can be provided as a lambda expression or as a method reference;

         */

        // Using method reference

        System.out.println("Using method reference: ");
        names.forEach(System.out::println);
        System.out.println();

        // Using method reference will print each names separately from the list


    }
}
