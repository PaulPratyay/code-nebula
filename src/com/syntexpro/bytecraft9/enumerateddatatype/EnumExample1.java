package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumExample1 {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {

        Season[] seasonsInYear = Season.values();

        System.out.println("There are normally four seasons in a year: ");

        for (Season s : seasonsInYear) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("'" + Season.WINTER + "'" + " and " + "'" + Season.SPRING + "'" + " are my favorite seasons");
    }
}
