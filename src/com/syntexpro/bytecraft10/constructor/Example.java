package com.syntexpro.bytecraft10.constructor;

public class Example {

    String name, address;
    int Salary;

    public Example(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Data = [" +
                "name ='" + name + '\'' +
                ", address ='" + address + '\'' +
                ", Salary = " + Salary +
                ']';
    }

    public static void main(String[] args) {

        Example ex1 = new Example("Icy", "DE", 170_000);
        Example ex2 = new Example("Zendria", "Jaipur", 150_000);
        Example ex3 = new Example("Ryan", "NYC", 180_000);
        Example ex4 = new Example("Tom", "MI", 175_000);
        Example ex5 = new Example("Paul", "PA", 200_000);

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);
        System.out.println(ex5);


    }
}
