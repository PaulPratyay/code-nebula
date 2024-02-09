package com.syntexpro.javaclass13.oops_concept.inheritance.iii_hierarchical_inheritance.example1;

public class Rectangle extends Shape{

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

    public static void main(String[] args) {
         Rectangle rectangle = new Rectangle(1.2,1.8);

        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.calculatePerimeter());
    }

    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }
}
