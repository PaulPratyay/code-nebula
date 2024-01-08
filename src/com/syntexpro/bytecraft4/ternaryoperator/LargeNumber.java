package com.syntexpro.bytecraft4.ternaryoperator;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {

        //This program gives the largest number between two given numbers

        Scanner largeNumber = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = largeNumber.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = largeNumber.nextDouble();

        String a = (num1 > num2) ? +num1 + " is greater " : +num2 + " is greater ";
        System.out.println(a);
    }
}
