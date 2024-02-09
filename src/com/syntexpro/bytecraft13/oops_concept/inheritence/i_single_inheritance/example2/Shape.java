package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example2;

public abstract class Shape {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void draw(){
        System.out.println("Draw the shape");
    }
}
