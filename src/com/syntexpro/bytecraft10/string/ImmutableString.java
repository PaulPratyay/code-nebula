package com.syntexpro.bytecraft10.string;

public class ImmutableString {
    public static void main(String[] args) {

        String name = "Java";

        name.concat("Programming");

        System.out.println(name);

        /*
        -> Here, "Java" is not changed but a new object is created with "Java Programming" in 'String Constant Pool' in the Heap Memory;
        -> That is why String is known as Immutable which means unchangeable;
         */

        name = name.concat("Programming");

        System.out.println(name);

        /*
        -> Here, we explicitly assign it to the reference variable 'name', and now it will refer to "Java Programming" object in the 'String Constant Pool' in the Heap Memory;
         */
    }
}
