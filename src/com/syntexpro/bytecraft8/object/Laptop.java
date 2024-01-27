package com.syntexpro.bytecraft8.object;

public class Laptop {

    String laptopBrand = "Lenovo";

    double laptopPrice = 1699.00;

    String laptopProcessor = "INTEL Core i5-3470 Ivy Bridge";

    int myField;
    String myString;

    // Creating constructor to assign value

    public Laptop(int initialValue, String initialString) {
        myField = initialValue;
        myString = initialString;
    }

    // Method

    public double getLaptopPrice(double price) {
        return price;
    }

    // Method

    public void displayValues(){
        System.out.println("myField = " + myField);
        System.out.println("myString = " + myString);

    }

}

/*
    using 'final' keyword won't allow to change the value of any variable;
 */