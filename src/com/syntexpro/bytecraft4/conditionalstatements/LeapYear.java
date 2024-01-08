package com.syntexpro.bytecraft4.conditionalstatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner leapYear = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = leapYear.nextInt();

        String lP = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? + year +  " is a Leap Year" : + year + " is not a Leap Year";
        System.out.println(lP);

    }
}
