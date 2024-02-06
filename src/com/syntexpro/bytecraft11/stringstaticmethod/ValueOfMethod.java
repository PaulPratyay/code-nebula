package com.syntexpro.bytecraft11.stringstaticmethod;

/*
    valueOf();
    -> It is a static method that converts different types of values, such as primitive or objects, to their string representation;
    -> It returns a string representation of the specified value;
    -> This method is often used when we want to concatenate a non=string value with a string or when we need to convert to a value to a string explicitly;
 */

public class ValueOfMethod {
    public static void main(String[] args) {

        // Converting an integer to a string

        int num = 108;
        String strNum = String.valueOf(num);
        System.out.println(strNum);

        // Concatenating a string with another value

        int accessModifiers = 4;
        String am = "There are " + String.valueOf(accessModifiers) + " access modifiers in Java";
        System.out.println(am);

        // Converting a double to a string

        double pi = 3.141592654;
        String valueOfPi = "Value of pi is " + String.valueOf(pi);
        System.out.println(valueOfPi);

        // Converting boolean to a string

        boolean isJavaFun = true;
        String javaIsFun = "Is Java Programming Fun? " + String.valueOf(isJavaFun);
        System.out.println(javaIsFun);


    }
}
