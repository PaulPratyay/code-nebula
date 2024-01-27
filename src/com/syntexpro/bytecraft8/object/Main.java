package com.syntexpro.bytecraft8.object;

public class Main {
    public static void main(String[] args) {

        // Calling the 'Laptop' class

        Laptop lenovo = new Laptop(42,"Java");

        System.out.println(lenovo.laptopBrand);
        System.out.println(lenovo.laptopPrice);
        System.out.println(lenovo.laptopProcessor);
        System.out.println(lenovo.getLaptopPrice(1799.00));

        System.out.println();

        System.out.println(lenovo.laptopBrand = "hp");
        System.out.println(lenovo.laptopPrice = 1799.00);
        System.out.println(lenovo.laptopProcessor = "INTEL Quard Core");

        System.out.println();

        Laptop myObject = new Laptop(42, "Java");
        myObject.displayValues();


    }
}
