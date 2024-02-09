package com.syntexpro.javaclass13.oops_concept.inheritance.iii_hierarchical_inheritance.example2;

public class Manager extends SoftwareDevelopment{

    @Override
    public void requirements() {
        super.requirements();
    }

    @Override
    public void analysis() {
        super.analysis();
    }

    public void team(){
        System.out.println("Create a good project team");
    }

    public void planning() {
        System.out.println("Plan the overall structure for developing software");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.analysis();
        manager.requirements();
        manager.team();
        manager.planning();
    }
}
