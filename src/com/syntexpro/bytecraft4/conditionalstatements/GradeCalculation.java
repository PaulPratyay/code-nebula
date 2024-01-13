package com.syntexpro.bytecraft4.conditionalstatements;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        //Program to print Grades

        Scanner gradeCalculation = new Scanner(System.in);

        System.out.println("Enter your overall marks: ");
        double marks = gradeCalculation.nextDouble();

        if (marks >= 95 && marks <= 100) {
            System.out.println("Your Grade is: A");
        } else if (marks >= 92 && marks <= 94) {
            System.out.println("Your Grade is: A-");
        } else if (marks >= 89 && marks <= 91) {
            System.out.println("Your Grade is: B+");
        } else if (marks >= 86 && marks <= 88) {
            System.out.println("Your Grade is: B");
        } else if (marks >= 83 && marks <= 85) {
            System.out.println("Your Grade is: B-");
        } else if (marks >= 80 && marks <= 82) {
            System.out.println("Your Grade is: C+");
        } else if (marks >= 77 && marks <= 79) {
            System.out.println("Your Grade is: C");
        } else if (marks >= 74 && marks <= 76) {
            System.out.println("Your Grade is: C-");
        } else {
            System.out.println("Your Grade is: F");
        }


    }
}
