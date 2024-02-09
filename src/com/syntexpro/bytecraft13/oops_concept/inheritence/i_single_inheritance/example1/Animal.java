package com.syntexpro.javaclass13.oops_concept.inheritance.i_single_inheritance.example1;

public class Animal {

    public void mammalianTraits(){
        System.out.println("Mammals that bear live young");
        System.out.println("The females have mammary glands, and they suckle their offspring");
    }
    public void senses(){
        System.out.println("Have senses of sight and smell ");
    }
    public void locomotion(){
        System.out.println("Have the ability to move around freely");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.mammalianTraits();
        animal.senses();
        animal.locomotion();
    }
}
