package com.syntexpro.homework.conditionalstatements;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        /*
        Program to check if the given year is a leap year or not
        Logic:
        ->if year is divisible by 4 and not divisible by 100, then it is a Leap Year;
        ->if the year is divisible by 400, it is a Leap year
         */



        Scanner leapYear = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = leapYear.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(+year + " is a Leap Year");
        } else {
            System.out.println(+year + " is not a Leap Year");
        }

    }
}




