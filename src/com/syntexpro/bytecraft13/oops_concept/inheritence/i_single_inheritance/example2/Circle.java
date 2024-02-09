package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example2;

public class Circle extends Shape{

    public Circle(double radius){
        this.radius = radius;

    }

    double radius;
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

    public static void main(String[] args) {

        Circle circle = new Circle(1.5);

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        circle.draw();
    }
}
