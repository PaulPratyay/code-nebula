package com.syntexpro.bytecraft10.constructor;

/*
    -> A constructor which has a specific number of parameters is called a parameterized constructor;
    -> The parameterized constructor is used to provide different values to distinct objects;
    -> However, we can provide the same values also;
 */

public class ParameterizedConstructor {

    int id;
    String name;
    String university;

    public ParameterizedConstructor(int id, String name, String university) {
        this.id = id;
        this.name = name;
        this.university = university;
    }

    public void displayValue() {
        System.out.println("Student Data =  [Student ID: " + id + ", Student Name: " + name + ", University: " + university);
    }

    public static void main(String[] args) {

        ParameterizedConstructor s1 = new ParameterizedConstructor(12, "Zendria", "Malaviya National Institute of Technology Jaipur");
        ParameterizedConstructor s2 = new ParameterizedConstructor(18, "Paul", "Gujarat Technological University");
        ParameterizedConstructor s3 = new ParameterizedConstructor(23, "Kayden", "University of Delaware");
        ParameterizedConstructor s4 = new ParameterizedConstructor(28, "Sophie", "Wilmington University");
        ParameterizedConstructor s5 = new ParameterizedConstructor(30, "Icy", "Princeton University");

        s1.displayValue();
        s2.displayValue();
        s3.displayValue();
        s4.displayValue();
        s5.displayValue();

    }
}
