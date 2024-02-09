package com.syntexpro.javaclass13.oops_concept.inheritance.iii_hierarchical_inheritance.example2;

public class Programmer extends SoftwareDevelopment{

    @Override
    public void project() {
        super.project();
    }

    @Override
    public void development() {
        super.development();
    }

    public void fixBug() {
        System.out.println("Fix errors and bugs");
    }
    public void softwareDesign(){
        System.out.println("Design the software");
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        programmer.project();
        programmer.development();
        programmer.fixBug();
        programmer.softwareDesign();

    }
}
