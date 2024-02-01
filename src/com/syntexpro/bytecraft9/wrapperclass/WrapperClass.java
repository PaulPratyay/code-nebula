package com.syntexpro.bytecraft9.wrapperclass;

/*
    -> The wrapper class in Java provides a mechanism to convert primitive data types into objects and objects into primitive data types;
    -> Wrapper classes contain useful methods;
    -> Wrapper classes can be used with collections (ex. ArrayList);

Autoboxing: The automatic conversion that the java compiler makes of the primitive data types into its corresponding object wrapper classes;
Unboxing: The automatic conversion that the java compiler makes of the object wrapper classes into primitive data types; It is the reverse of autoboxing;
 */

public class WrapperClass {
    public static void main(String[] args) {

        // Using wrapper classes to convert primitive types to objects

        Integer intObject = Integer.valueOf(108);            //Converting int to Integer
        Double doubleObject = Double.valueOf(3.1416);       //Converting double to Double

        System.out.println("Converting Primitive Types to Objects");
        System.out.println(intObject);
        System.out.println(doubleObject);

        // Using wrapper classes to convert objects to primitive types

        int intValue = intObject.intValue();                     // Converting Integer to int
        double doubleValue = doubleObject.doubleValue();        //Converting Double to double

        System.out.println("Converting Objects to Primitive Types");
        System.out.println(intValue);
        System.out.println(doubleValue);

        // Autoboxing and Unboxing (automatic conversion between primitive types and wrapper classes)

        Integer autoBoxedInt = 55;          // autoboxing (int to Integer)
        int unBoxedInt = autoBoxedInt;      // unboxing (Integer to int)

        System.out.println("Autoboxing and Unboxing");
        System.out.println(autoBoxedInt);
        System.out.println(unBoxedInt);

        // Using wrapper classes with Strings

        String intString = "54";
        int parseInt = Integer.parseInt(intString);

        System.out.println("Parsing String");
        System.out.println(parseInt * 2);


    }
}
