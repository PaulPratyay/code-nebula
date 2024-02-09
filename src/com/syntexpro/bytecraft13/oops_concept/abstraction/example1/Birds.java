package com.syntexpro.bytecraft13.oops_concept.abstraction.example1;

public class Birds extends Characteristics {

    @Override
    public void speech() {
        System.out.println("Communicate using sounds, visual cues etc.");
    }

    @Override
    public void diet() {
        System.out.println("Mostly eats seeds, insects, etc ");
    }

    @Override
    public void reasoning() {
        System.out.println("They do have reasoning capabilities but not so complex as humans");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat in order to survive");
    }

    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.eat();
        birds.sleep();
        birds.emotion();
        birds.speech();
        birds.diet();
        birds.reasoning();
    }
}
