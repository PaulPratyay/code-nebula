package com.syntexpro.bytecraft5.conditionalstatements;

import java.util.Scanner;

public class SeasonDetermination {
    public static void main(String[] args) {

        Scanner seasonDetermination = new Scanner(System.in);

        System.out.println("Enter the months name to find out which season it corresponds to: ");
        String month = seasonDetermination.nextLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("It's Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It's Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It's Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Please enter the name of the month correctly");
        }
    }
}
