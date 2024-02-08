package com.syntexpro.bytecraft12.exception_handling.unchecked;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {

        double[] marks = new double[3];

        try {

            marks[0] = 93.95;
            marks[1] = 92.21;
            marks[2] = 92.15;
            marks[4] = 95;

            System.out.println("Marks = " + Arrays.toString(marks));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds for the given size of an array");
        }
    }
}
