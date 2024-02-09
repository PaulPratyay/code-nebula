package com.syntexpro.javaclass13.oops_concept.inheritance.iv_multiple_inheritance.example2;

public class Mage implements Character,Weapon{
    @Override
    public void attack() {
        System.out.println("Mage attacks with a wand");
    }

    @Override
    public void use() {
        System.out.println("Mage uses a wand");
    }
}
