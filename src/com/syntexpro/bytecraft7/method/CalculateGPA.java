package com.syntexpro.bytecraft7.method;

// Calculate averageCGPA using methods and arrays

public class CalculateGPA {
    public static void main(String[] args) {

        double[] semesterGPA = {4.00, 3.67, 3.67};
        System.out.println("Your average CGPA this semester: " + calculateAverageGPA(semesterGPA));

    }

    public static double calculateAverageGPA(double[] semesterGPA) {

        if (semesterGPA.length == 0) {
            System.out.println("Can't calculate CGPA for empty GPA");
            return 0.00;
        }

        double sumGPA = 0;

        for (int i = 0; i < semesterGPA.length; i++) {

            sumGPA += semesterGPA[i];
        }

        return sumGPA / semesterGPA.length;
    }
}
