package com.syntexpro.javaclass13.oops_concept.inheritance.iv_multiple_inheritance.example2;

public class MultipleInheritance {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        warrior.attack();
        mage.use();
        System.out.println();
        mage.attack();
        warrior.use();
    }
}
