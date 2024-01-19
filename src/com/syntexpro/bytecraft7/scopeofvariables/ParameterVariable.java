package com.syntexpro.bytecraft7.scopeofvariables;

public class ParameterVariable {
    public static void main(String[] args) {

        ParameterVariable object = new ParameterVariable();

        object.addNumbers(74, 64);
        object.subNumbers(83, 23);
        object.mulNumbers(91, 82);
        object.divNumbers(64, 34);

    }

    //Method with parameter variable

    public void addNumbers(int a, int b) {
        int addResult = a + b;
        System.out.println("Addition = " + addResult);
    }

    public void subNumbers(int a, int b) {
        int subResult = a - b;
        System.out.println("Subtraction = " + subResult);
    }

    public void mulNumbers(int a, int b) {
        int mulResult = a * b;
        System.out.println("Multiplication = " + mulResult);
    }

    public void divNumbers(double a, double b) {
        double divResult = a / b;
        System.out.println("Division = " + divResult);
    }
}
