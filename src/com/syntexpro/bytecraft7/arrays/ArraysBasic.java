package com.syntexpro.bytecraft7.arrays;

/*
    -> Array is a data structure that allows us to store multiple values of the same type under a single variable;
    -> Array provides a way to work with collection of data more efficiently than individual variables;
    -> Creating an Array: <data type> [] <reference variable> = <'new' keyword> <data type> [size of an array];
    => Indexing starts from 0;
 */

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {

        int science = 98;
        int math = 99;
        int socialScience = 100;

        int[] marks = new int[3];

        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 100;

        System.out.println("Marks = " + Arrays.toString(marks));
        System.out.println("Size of array: " + marks.length);
        System.out.println(marks[2]);
        System.out.println();

        double[] marksSheet = new double[6];

        marksSheet[0] = 95;
        marksSheet[1] = 93.95;
        marksSheet[2] = 92.21;
        marksSheet[3] = 92.15;

        System.out.println("Marks sheet = " + Arrays.toString(marksSheet));
        System.out.println("Size of array: " + marksSheet.length);
        System.out.println(marksSheet[2]);
        System.out.println();

        String[] programmingLanguage = new String[8];

        programmingLanguage[1] = "C++";
        programmingLanguage[2] = "Java";
        programmingLanguage[3] = "JavaScript";
        programmingLanguage[4] = "Python";
        programmingLanguage[6] = "HTML";
        programmingLanguage[7] = "CSS";

        System.out.println("Programming Languages = " + Arrays.toString(programmingLanguage));
        System.out.println("Size of array = " + programmingLanguage.length);
        System.out.println(programmingLanguage[2]);
        System.out.println();

        //Another way of writing array

        int[] counter = {1, 2, 3, 4, 5};
        System.out.println("Counter = " + Arrays.toString(counter));
        System.out.println("Size of array: " + counter.length);
        System.out.println(counter[0]);
        System.out.println(counter[4]);


    }
}
