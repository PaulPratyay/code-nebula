package com.syntexpro.bytecraft5.conditionalstatements;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner monthName = new Scanner(System.in);

        System.out.println("Enter the month number (1-12): ");
        int month = monthName.nextInt();

        String nameMonth;

        switch (month) {
            case 1:
                nameMonth = "January";
                break;
            case 2:
                nameMonth = "February";
                break;
            case 3:
                nameMonth = "March";
                break;
            case 4:
                nameMonth = "April";
                break;
            case 5:
                nameMonth = "May";
                break;
            case 6:
                nameMonth = "June";
                break;
            case 7:
                nameMonth = "July";
                break;
            case 8:
                nameMonth = "August";
                break;
            case 9:
                nameMonth = "September";
                break;
            case 10:
                nameMonth = "October";
                break;
            case 11:
                nameMonth = "November";
                break;
            case 12:
                nameMonth = "December";
                break;
            default:
                nameMonth = "There are 12 months in a year";

        }
        System.out.println(+month + " number month is " + nameMonth);
    }
}
