package com.syntexpro.bytecraft5.conditionalstatements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner dayOfWeek = new Scanner(System.in);

        System.out.println("Enter the number of day between 1-7: ");
        int day = dayOfWeek.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday is the first day of the week");
                break;
            case 2:
                System.out.println("Tuesday is the second day of the week");
                break;
            case 3:
                System.out.println("Wednesday is the third day of the week");
                break;
            case 4:
                System.out.println("Thursday is the fourth day of the week");
                break;
            case 5:
                System.out.println("Friday is the fifth day of the week");
                break;
            case 6:
                System.out.println("Saturday is a weekend and sixth day of the week");
                break;
            case 7:
                System.out.println("Sunday is a weekend and last day of the week");
                break;
            default:
                System.out.println("There are only 7 days a week");

        }
    }
}
