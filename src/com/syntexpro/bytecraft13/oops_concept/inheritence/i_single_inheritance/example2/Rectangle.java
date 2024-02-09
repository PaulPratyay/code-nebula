package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example2;

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

    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1.5, 2.4);

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
        rectangle.draw();
    }
}
