package com.syntexpro.bytecraft13.oops_concept.inheritence.iv_multiple_inheritance.example1;

public class MultipleInheritanceTest {
    public static void main(String[] args) {

        Fruits fruits = new Fruits();
        System.out.println("Avocado:");
        fruits.sizeAndShapeAvocado();
        fruits.avocadoTrees();
        fruits.avocadoColor();
        fruits.avocadoTaste();
        System.out.println("Mango:");
        fruits.sizeAndShapeMango();
        fruits.mangoTrees();
        fruits.mangoColor();
        fruits.mangoTaste();
    }
}
