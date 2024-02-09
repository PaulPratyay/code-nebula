package com.syntexpro.bytecraft13.oops_concept.abstraction.example1;

public class Humans extends Characteristics {
    @Override
    public void speech() {
        System.out.println("Have their own language to express themselves");
    }

    @Override
    public void diet() {
        System.out.println("Omnivores. They eat both plants and animals");
    }

    @Override
    public void reasoning() {
        System.out.println("Have abilities to solve complex problems");
    }

    @Override
    public void eat() {
        System.out.println("Humans need to eat in order to survive");
    }

    public static void main(String[] args) {
        Humans humans = new Humans();
        humans.eat();
        humans.sleep();
        humans.emotion();
        humans.speech();
        humans.diet();
        humans.reasoning();
    }
}
