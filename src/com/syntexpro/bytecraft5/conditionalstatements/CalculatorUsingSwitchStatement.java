package com.syntexpro.bytecraft5.conditionalstatements;

import java.util.Scanner;

public class CalculatorUsingSwitchStatement {
    public static void main(String[] args) {

        //This calculator will perform basic mathematical operations between two numbers

        Scanner calculatorSwitch = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = calculatorSwitch.nextDouble();

        System.out.println("Enter the operator: ( +, -, *, / ) ");
        char operator = calculatorSwitch.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = calculatorSwitch.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
