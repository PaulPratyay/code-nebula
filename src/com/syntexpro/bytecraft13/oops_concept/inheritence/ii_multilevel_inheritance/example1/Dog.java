package com.syntexpro.javaclass13.oops_concept.inheritance.ii_multilevel_inheritance.example1;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog can bark");
    }

    @Override
    public void mammalianTraits() {
        System.out.println("Dog are mammals that bear live young");
        System.out.println("The females have mammary glands, and they suckle their offspring");
    }

    @Override
    public void senses() {
        System.out.println("Dogs have senses of sight and smell");
    }

    @Override
    public void locomotion() {
        super.locomotion();
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bark();
        dog.mammalianTraits();
        dog.senses();
        dog.locomotion();
    }
}
