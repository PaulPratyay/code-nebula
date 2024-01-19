package com.syntexpro.bytecraft7.scopeofvariables;

public class ClassVariable {

    //Declaring a class variable

    int classVariable;

    //Constructor using the class variable

    public ClassVariable(int value) {
        this.classVariable = value;
    }

    //Method to print class variable

    public void printClassVariable() {
        System.out.println("classVariable = " + classVariable);
    }

    public static void main(String[] args) {

        ClassVariable obj1 = new ClassVariable(10);
        ClassVariable obj2 = new ClassVariable(20);

        obj1.printClassVariable();
        obj2.printClassVariable();

    }
}
