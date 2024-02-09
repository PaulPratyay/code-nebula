package com.syntexpro.bytecraft13.oops_concept.abstraction.example2;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw the circle");
    }

    @Override
    public String getDescription() {
        return "This is a circle";
    }

    @Override
    public int getNumberOfSides() {
        return 0;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1.8);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        circle.draw();
        System.out.println("Description: " + circle.getDescription());
        System.out.println("No of sides: " + circle.getNumberOfSides());
    }
}
