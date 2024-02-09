package com.syntexpro.bytecraft13.oops_concept.abstraction.example1;

public abstract class Characteristics {

    public void eat() {
        System.out.println("Needs to eat in order to survive");
    }

    public void sleep() {
        System.out.println("Needs to sleep for rest and rejuvenation");
    }

    public void emotion() {
        System.out.println("Have emotions");
    }

    public abstract void speech();

    public abstract void diet();

    public abstract void reasoning();

}
