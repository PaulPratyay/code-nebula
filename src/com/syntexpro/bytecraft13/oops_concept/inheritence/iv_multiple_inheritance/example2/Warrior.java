package com.syntexpro.javaclass13.oops_concept.inheritance.iv_multiple_inheritance.example2;

public class Warrior implements Character,Weapon{
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword");
    }

    @Override
    public void use() {
        System.out.println("Warrior uses the sword");
    }
}
