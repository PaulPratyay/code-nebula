package com.syntexpro.bytecraft7.arrays;

// Sum of ArrayElements

public class ArraysExample3 {
    public static void main(String[] args) {

        // Declare and initialize an array of integers

        int[] numbers = {25, 12, 63, 92, 50};

        // Calculate sum of array elements

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print sum of array elements

        System.out.println("Sum of Array Elements: " + sum);
    }
}
