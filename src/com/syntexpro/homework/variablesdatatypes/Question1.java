package com.syntexpro.homework.variablesdatatypes;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner averageThreeNumbers = new Scanner(System.in);

        System.out.println("Enter your input for A: ");
        double A = averageThreeNumbers.nextDouble();

        System.out.println("Enter your input for B: ");
        double B = averageThreeNumbers.nextDouble();

        System.out.println("Enter your input for C: ");
        double C = averageThreeNumbers.nextDouble();

        double average = (A + B + C) / 3;

        System.out.println("Average of three given inputs = (" + A + " + " + B + " + " + C + ")/3" + " = " + average);


    }
}

// System.out.println("The average of three numbers: " + average);
//System.out.println("The average of input A,B & C: " + (A + B + C)/3);