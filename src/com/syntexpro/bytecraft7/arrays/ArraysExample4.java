package com.syntexpro.bytecraft7.arrays;

// Finding the maximum element

public class ArraysExample4 {
    public static void main(String[] args) {

        // Declare and initialize an array of integers

        int[] data = {1, 99, 23, 105, 65, 108};

        // Find the maximum element of the array

        int maximum = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        // Print the maximum element

        System.out.println("Maximum element of the array: " + maximum);
    }
}
