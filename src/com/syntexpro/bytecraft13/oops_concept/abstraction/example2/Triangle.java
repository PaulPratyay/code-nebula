package com.syntexpro.bytecraft13.oops_concept.abstraction.example2;

import java.awt.*;

public class Triangle extends Shape {

    double sideA, sideB, base, height;

    public Triangle(double sideA, double sideB, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + base;
    }

    @Override
    public String getDescription() {
        return "This is a triangle";
    }

    @Override
    public int getNumberOfSides() {
        return 3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1.8, 2.5, 1.5, 2.2);

        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        triangle.draw();
        System.out.println("Description: " + triangle.getDescription());
        System.out.println("Number of sides: " + triangle.getNumberOfSides());
    }
}
