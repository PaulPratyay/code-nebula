package com.syntexpro.bytecraft13.oops_concept.abstraction.example1;

public class Dogs extends Characteristics {
    @Override
    public void speech() {
        System.out.println("They have their body languages to express");
    }

    @Override
    public void diet() {
        System.out.println("They are mostly carnivores");
    }

    @Override
    public void reasoning() {
        System.out.println("They do have reasoning capabilities but not as complex as humans");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat in order to survive");
    }

    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();
        dog.sleep();
        dog.emotion();
        dog.speech();
        dog.diet();
        dog.reasoning();
    }
}
