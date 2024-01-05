package com.syntexpro.homework.variablesdatatypes;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner areaSquare = new Scanner(System.in);

        System.out.println("Enter the side of the square: ");
        double side = areaSquare.nextDouble();

        System.out.println("The area of the square: " + (side * side));
    }
}
