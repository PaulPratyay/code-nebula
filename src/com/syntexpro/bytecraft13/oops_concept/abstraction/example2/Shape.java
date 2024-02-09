package com.syntexpro.bytecraft13.oops_concept.abstraction.example2;

public abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void draw() {
        System.out.println("Draw the shape");
    }

    public abstract String getDescription();

    public abstract int getNumberOfSides();

}
