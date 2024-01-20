package com.syntexpro.bytecraft7.method;

/*
    -> Method is a block of code that performs a specific task or operation;
    -> Method allows us to organize our code into reusable blocks, which makes our code modular and more maintainable;
    -> We write method once and use it many times;
    -> Naming a method is same as the variable;
    => Method Header -> <access modifier> <return type/data type> <method name> <parameter list> {method body};
    Two types of Method:
    1) Void:
        -> void doesn't store any value/information;
        -> It just performs the functions that are mentioned in the method body;
        -> Using 'void' in a method means the method does not return anything;

=> Method Overloading: Same method name with different parameters;

 */

public class MethodBasic {
    public static void main(String[] args) {

        System.out.println("Void Method");
        addition();
        printString();
        System.out.println("Return Method");
        returnMethod(); // It is not printed, because the return "25 + 64" is stored in returnMethod;
        System.out.println("Addition in return method: " + returnMethod());
        System.out.println("String in return method: " + returnMethod("Java")); // I had to provide a parameter as firstString to call this 'returnMethod'

    }

    public static void addition() {
        System.out.println("Addition result: " + (54 + 54));
    }

    public static void printString() {
        System.out.println("Java is an object-oriented programming language");
        System.out.println("Java is platform independent");
    }

    public static int returnMethod() {
        return 25 + 64;
    }

    public static String returnMethod(String firstString) {
        return "I am enjoying learning Java Programming";
    }


}
