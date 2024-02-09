package com.syntexpro.javaclass13.oops_concept.inheritance.iv_multiple_inheritance.example1;

public class Fruits implements Mango,Avocado{
    @Override
    public void sizeAndShapeAvocado() {
        System.out.println("Avocado can be round, pear-shaped, or oblong");
    }

    @Override
    public void avocadoTrees() {
        System.out.println("Avocado trees can be tall or spreading, and they have elliptic to egg shaped leaves that are 10-30 cm in length");
    }

    @Override
    public void avocadoColor() {
        System.out.println("Avocados can be brown, green, purplish, or black");
    }

    @Override
    public void avocadoTaste() {
        System.out.println("Avocado fruits have greenish or yellowish flesh with a buttery consistency and a rich nutty flavor.");
    }

    @Override
    public void sizeAndShapeMango() {
        System.out.println("Mangoes can be oval, round, heart-shaped, kidney-shaped, or long and slender");
    }

    @Override
    public void mangoTrees() {
        System.out.println("The mango tree is evergreen, often reaching 15–18 metres (50–60 feet) in height and attaining great age.");
    }

    @Override
    public void mangoColor() {
        System.out.println("Some varieties of mangoes are vividly colored with shades of red and yellow, while others are dull green.");
    }

    @Override
    public void mangoTaste() {
        System.out.println("The flesh that surrounds the seed is yellow to orange in color, juicy, and of a distinctive sweet-spicy flavor.");
    }
}
