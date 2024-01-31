package com.syntexpro.bytecraft9.enumerateddatatype;

/*
    -> 'enum' in Java is a data type which contains a fixed set of constants;
    -> It can be thought of as classes which have a fixed set of constants (a variable that does not change);
    -> The Java enum constants are static and final implicitly;
    -> According to Java naming conventions, we should have all constants in capital letters;
    -> 'enum' is used to create our own data type like classes;
    -> The 'enum' data type (also known as Enumerated Data Type) is used to define an enum im Java;
 */

import java.sql.SQLOutput;

public class Enum {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day[] daysInWeek = Day.values();

        /*
            -> The `.values()` method is a built-in method provided by enums;
            -> It returns an array containing all the enum constants in the order they are declared;
            -> The primary use of `.values()` method is to obtain an array that represents all the possible values of an enum;
         */

        System.out.println("There are 7 days in a week: ");

        for (int i = 0; i < daysInWeek.length; i++) {
            Day nameOfDay = daysInWeek[i];
            System.out.println(nameOfDay);
        }

        // When the data are in an array, the best practice is to use enhanced 'for' loop
        System.out.println();
        System.out.println("Using Enhanced 'for' loop");
        for (Day day : daysInWeek) {
            System.out.println(day);
        }
        System.out.println();
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SUNDAY);
    }
}
