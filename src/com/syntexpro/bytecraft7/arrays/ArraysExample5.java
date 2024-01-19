package com.syntexpro.bytecraft7.arrays;

// Finding the minimum element

public class ArraysExample5 {
    public static void main(String[] args) {

        // Declare and initialize an array of integers

        int[] data = {12, 85, 6, 45, 1, 65};

        // Find the minimum element of the array

        int minimum = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < minimum) {
                minimum = data[i];
            }
        }

        // Print the minimum element

        System.out.println("Minimum element of the array: " + minimum);
    }
}
