package com.syntexpro.bytecraft7.scopeofvariables;

public class LocalVariable {
    public static void main(String[] args) {

        LocalVariable object = new LocalVariable();

        object.showingLocalVariable();

    }

    //Method with a local variable

    public void showingLocalVariable() {
        int localVariable = 108;
        System.out.println("localVariable = " + localVariable);
    }
}
