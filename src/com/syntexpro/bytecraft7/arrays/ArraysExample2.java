package com.syntexpro.bytecraft7.arrays;

// Modifying Array Elements

import java.util.Arrays;

public class ArraysExample2 {
    public static void main(String[] args) {

        // Declare and initialize an array of strings

        String[] rainbowColors = {"Violet", "Indigo", "Brown", "Grey", "Yellow", "Orange", "Red" };

        // Printing original array

        System.out.println("Rainbow Colors (VIBGYOR): " + Arrays.toString(rainbowColors));

        // Modifying Array Elements

        rainbowColors[2] = "Blue";
        rainbowColors[3] = "Green";

        //Printing modified array

        System.out.println("Rainbow Colors (VIBGYOR) = " + Arrays.toString(rainbowColors));
    }
}
