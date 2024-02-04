package com.syntexpro.bytecraft10.constructor;

/*
    -> A default constructor doesn't have any parameter;
    -> It is also known as no-argument constructor;
    -> The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type;

Rule: If there is no constructor in a class, compiler automatically creates a default constructor;
 */

public class DefaultConstructor {

    DefaultConstructor() {
        System.out.println("Default Constructor is created.");
    }

    public static void main(String[] args) {

        DefaultConstructor obj = new DefaultConstructor();
    }
}
