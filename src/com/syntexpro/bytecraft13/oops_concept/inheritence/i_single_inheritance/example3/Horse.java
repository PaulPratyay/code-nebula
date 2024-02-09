package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example3;

public class Horse extends Human{

    public void runFast() {
        System.out.println("Horses can run fast");
    }

    @Override
    public void eat() {
        System.out.println("Horses can eat");;
    }

    @Override
    public void walk() {
        System.out.println("Horses can walk");
    }

    @Override
    public void sleep() {
        System.out.println("Horse can sleep");
    }

    public static void main(String[] args) {




        Horse horse = new Horse();
        horse.runFast();
        horse.eat();
        horse.walk();
        horse.sleep();
    }


}
