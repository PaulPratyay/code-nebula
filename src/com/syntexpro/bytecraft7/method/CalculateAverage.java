package com.syntexpro.bytecraft7.method;

// Calculate average using methods and arrays

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {

        double[] semesterMarks = {95, 93.95, 92.15};
        System.out.println("Your average marks this semester: " + calculateAverage(semesterMarks));


    }

    public static double calculateAverage(double[] semesterMarks) {

        if (semesterMarks.length == 0) {
            System.out.println("Can't calculate average for empty marks");
            return 0.0;
        }

        double sum = 0;

        for (int i = 0; i < semesterMarks.length; i++) {

            sum += semesterMarks[i];
        }

        return sum / semesterMarks.length;
    }
}
