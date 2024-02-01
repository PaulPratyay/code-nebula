package com.syntexpro.bytecraft9.enumerateddatatype;

import java.util.EnumSet;

public class EnumSetExample2 {

    enum Months {
        DECEMBER, JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
    }

    public static void main(String[] args) {

        EnumSet<Months> winter = EnumSet.range(Months.DECEMBER, Months.FEBRUARY);
        System.out.println("Winter Months: " + winter);

        EnumSet<Months> spring = EnumSet.range(Months.MARCH, Months.MAY);
        System.out.println("Spring Months: " + spring);

        EnumSet<Months> summer = EnumSet.range(Months.JUNE, Months.AUGUST);
        System.out.println("Summer Months: " + summer);

        EnumSet<Months> fall = EnumSet.range(Months.SEPTEMBER, Months.NOVEMBER);
        System.out.println("Fall Months: " + fall);
    }
}
