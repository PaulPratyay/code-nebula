package com.syntexpro.bytecraft7.referencetypes;

import java.awt.*;

public class ReferenceTypes {
    public static void main(String[] args) {

        /*
        In Java, there are two main categories of data types:
        1) Primitive Data Types
        2) Non-primitive Data Type/Reference Types

        Reference types include Class, Interface, Array, Enumeration and String;

        Unlike primitive data types, which are used to store actual values,
        reference types store references (memory addresses) to objects;
         */

        int age = 18;
        System.out.println("age = " + age);

        Point pointA = new Point(10, 12);
        /*
        In the above declaration and instantiation statement,
        'Point' is an in-built java class;
        'pointA' is a reference variable;
        'new' is a keyword;
        'new Point' is a reference object;
         */
        System.out.println("pointA = " + pointA);

        pointA.move(12, 15);
        System.out.println("pointA = " + pointA);

    }
}
