package com.syntexpro.bytecraft9.statickeyword;

public class StaticVariable {

    int rollNumber;

    String studentName;

    static String universityName = "Gujarat Technological University";

    public StaticVariable(int rollNo, String stuName) {

        rollNumber = rollNo;
        studentName = stuName;
    }

    public void displayInformation() {

        System.out.println("Roll Number: " +rollNumber + ", Student Name: " + studentName + ", University Name: " + universityName);
    }

    public static void main(String[] args) {

        StaticVariable obj1 = new StaticVariable(12, "Astrogenius");
        StaticVariable obj2 = new StaticVariable(24, "SpectreNova");
        StaticVariable obj3 = new StaticVariable(2,"Zendria_X");

        obj1.displayInformation();
        obj2.displayInformation();
        obj3.displayInformation();

    }
}
