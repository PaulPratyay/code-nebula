package com.syntexpro.javaclass13.oops_concept.inheritance.iii_hierarchical_inheritance.example1;

public class Triangle extends Shape{

    double sideA, sideB, base, height;

    public Triangle(double sideA, double sideB, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5 * base * height);
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB + base);
    }

    @Override
    public void draw() {
        System.out.println("Draw the triangle");
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(2.8, 3.7, 5.6, 4.6);

        System.out.println("Area of the triangle:  " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
        triangle.draw();
    }
}
