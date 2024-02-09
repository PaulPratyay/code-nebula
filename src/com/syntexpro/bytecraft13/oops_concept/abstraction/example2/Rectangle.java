package com.syntexpro.bytecraft13.oops_concept.abstraction.example2;

public class Rectangle extends Shape {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }

    @Override
    public String getDescription() {
        return "This is a rectangle";
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8.5, 4.8);

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        rectangle.draw();
        System.out.println("Description: " + rectangle.getDescription());
        System.out.println("Number of sides: " + rectangle.getNumberOfSides());
    }
}
