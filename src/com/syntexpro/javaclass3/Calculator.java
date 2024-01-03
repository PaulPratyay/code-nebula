package com.syntexpro.javaclass3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to my First Java Calculator");
        System.out.println("This Calculator will perform Addition, Subtraction, Multiplication, Division and Modulus Operations between two numbers");

        Scanner calculator = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = calculator.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = calculator.nextDouble();

        double addition = num1 + num2, subtraction = num1 - num2, multiplication = num1 * num2, division = num1 / num2, remainder = num1 % num2;

        System.out.println("Here are the Results: ");
        System.out.println("Addition = " + num1 + " +" + num2 + " = " + addition);
        System.out.println("Subtraction = " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication = " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division = " + num1 + " / " + num2 + " = " + division);
        System.out.println("Remainder = " + num1 + " % " + num2 + " = " + remainder);
    }
}
