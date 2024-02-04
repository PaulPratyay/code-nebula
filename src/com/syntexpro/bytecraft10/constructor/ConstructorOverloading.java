package com.syntexpro.bytecraft10.constructor;

/*
    -> Constructor overloading in Java is a technique of having more than one constructor with different parameter lists;
    -> They are arranged in a way that each constructor performs a different task;
    -> They are differentiated by the compiler by the number of parameters in the list and their types;
 */

public class ConstructorOverloading {

    String name, program, university, address;
    int id, rollNumber;

    public ConstructorOverloading(String name) {
        this.name = name;
    }

    public ConstructorOverloading(String name, String program) {
        this.name = name;
        this.program = program;
    }

    public ConstructorOverloading(String name, String program, String university) {
        this.name = name;
        this.program = program;
        this.university = university;
    }

    public ConstructorOverloading(String name, String program, String university, String address) {
        this.name = name;
        this.program = program;
        this.university = university;
        this.address = address;
    }

    public ConstructorOverloading(String name, String program, String university, String address, int id) {
        this.name = name;
        this.program = program;
        this.university = university;
        this.address = address;
        this.id = id;
    }

    public ConstructorOverloading(String name, String program, String university, String address, int id, int rollNumber) {
        this.name = name;
        this.program = program;
        this.university = university;
        this.address = address;
        this.id = id;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Data[" +
                "Student Name ='" + name + '\'' +
                ", Program ='" + program + '\'' +
                ", University ='" + university + '\'' +
                ", Address ='" + address + '\'' +
                ", Student ID = " + id +
                ", Roll Number = " + rollNumber +
                ']';
    }

    public static void main(String[] args) {

        ConstructorOverloading s1 = new ConstructorOverloading("Toby");
        ConstructorOverloading s2 = new ConstructorOverloading("Icy", "Criminal Justice");
        ConstructorOverloading s3 = new ConstructorOverloading("Lourdes", "History", "Illinois Institute of Technology");
        ConstructorOverloading s4 = new ConstructorOverloading("Sophie", "English Literature", "University of Michigan", "MI");
        ConstructorOverloading s5 = new ConstructorOverloading("Kayden", "Cybersecurity", "University of Pennsylvania", "PA", 11);
        ConstructorOverloading s6 = new ConstructorOverloading("Zendria", "Music", "Malaviya National Institute of Technology Jaipur", "Jaipur", 108, 18);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
