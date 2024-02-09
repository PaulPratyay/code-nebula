package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example1;

public class Dog extends Animal{

    public void uniquesNosePrint() {
        System.out.println("Dog's nose print is unique just like human fingerprints");
    }
    public void dream() {
        System.out.println("All dogs dream");
        System.out.println("Puppies and senior dogs dream more frequently than adult dogs");
    }
    public void nonRetractableClaws() {
        System.out.println("Dogs have non-retractable claws");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.uniquesNosePrint();
        dog.dream();
        dog.nonRetractableClaws();
        dog.mammalianTraits();
        dog.senses();
        dog.locomotion();
    }




}
