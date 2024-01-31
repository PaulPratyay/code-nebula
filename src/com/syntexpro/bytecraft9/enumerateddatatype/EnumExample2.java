package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumExample2 {

    enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {

        Months[] monthsInYear = Months.values();

        System.out.println("There are 12 months in a year: ");
        for (Months month : monthsInYear) {
            System.out.println(month);
        }
    }
}
