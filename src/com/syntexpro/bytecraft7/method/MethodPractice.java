package com.syntexpro.bytecraft7.method;

public class MethodPractice {
    public static void main(String[] args) {

        System.out.println("Void Method");
        greet();
        oddOrEven(12);
        oddOrEven(25);
        System.out.println();

        System.out.println("Return Method");
        System.out.println("Division = " + division(92.21, 10));
        System.out.println("Multiplication = " + multiplication(45, 12));
        System.out.println("Addition = " + addition(54, 106));
        System.out.println("Subtraction = " + subtraction(64, 23));
        System.out.println(driveAndVote(18));
        System.out.println(driveAndVote(25));
        System.out.println(driveAndVote(17));

    }

    // void method with and without parameter

    public static void greet() {
        System.out.println("Hello Java");
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    // method with parameters and return method

    public static double division(double x, double y) {
        double result = x / y;
        return result;
    }

    public static int multiplication(int x, int y) {
        int result = (x * y);
        return result;
    }

    public static int addition(int x, int y) {
        int result = (x + y);
        return result;
    }

    public static int subtraction(int x, int y) {
        int result = (x - y);
        return result;
    }

    public static String driveAndVote(int age) {
        if (age >= 18) {
            return "You are eligible to drive and vote";
        } else
            return "You are below 18 years";
    }


}
