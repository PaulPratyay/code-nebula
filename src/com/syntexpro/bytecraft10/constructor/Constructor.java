package com.syntexpro.bytecraft10.constructor;

/*
    -> Constructor is used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor);
    -> Like methods, a constructor also contains a collection of statements (i.e. instructions) that are executed at the time of creation;

When is a constructor called?

    -> Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class;
    -> A constructor is invoked at the time of object or instance creation;

Rules of writing a Constructor:

-> Constructor of a class must have the same name as the class name in which it resides;
-> A constructor in Java cannot be abstract, final, static and Synchronized;
-> Access modifiers can be used in constructor declaration to control its access i.e. which other class can call the constructor;

There are two types of Constructor:
    1) No-argument Constructor/default Constructor
    2) Parameterized Constructor
 */

public class Constructor {

    String name;
    int id;

    public Constructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayValue() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {

        Constructor s1 = new Constructor("Icy", 12);
        Constructor s2 = new Constructor("Lourdes", 11);
        Constructor s3 = new Constructor("Addie", 15);
        Constructor s4 = new Constructor("Sa'ada", 18);
        Constructor s5 = new Constructor("Toby", 23);

        s1.displayValue();
        s2.displayValue();
        s3.displayValue();
        s4.displayValue();
        s5.displayValue();


    }
}
