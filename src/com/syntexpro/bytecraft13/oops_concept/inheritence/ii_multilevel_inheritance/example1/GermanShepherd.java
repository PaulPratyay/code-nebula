package com.syntexpro.javaclass13.oops_concept.inheritance.ii_multilevel_inheritance.example1;

public class GermanShepherd extends Dog{

    public void guard(){
        System.out.println("German shepherd is a good breed to guard");
    }
    public void bodyShape(){
        System.out.println("German shepherd is a powerful and muscular breed");
    }

    @Override
    public void bark() {
        System.out.println("German Shepherd can bark");
    }

    @Override
    public void mammalianTraits() {
        super.mammalianTraits();
    }

    @Override
    public void senses() {
        super.senses();
    }

    @Override
    public void locomotion() {
        super.locomotion();
    }

    public static void main(String[] args) {
         GermanShepherd germanShepherd = new GermanShepherd();

         germanShepherd.guard();
         germanShepherd.bodyShape();
         germanShepherd.bark();
         germanShepherd.senses();
         germanShepherd.locomotion();
         germanShepherd.mammalianTraits();
    }
}
