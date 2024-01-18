package com.syntexpro.bytecraft6.breakstatement;

import java.util.Scanner;

public class BreakInSwitchStatement {
    public static void main(String[] args) {

        Scanner dayOfWeek = new Scanner(System.in);

        System.out.println("Enter the number of day: ");
        int day = dayOfWeek.nextInt();

        switch (day) {
            case 1:
                System.out.println("It's a Monday");
                break;
            case 2:
                System.out.println("t's a Tuesday");
                break;
            case 3:
                System.out.println("it's a Wednesday");
                break;
            case 4:
                System.out.println("It's a Thursday");
                break;
            case 5:
                System.out.println("It's a Friday");
                break;
            case 6:
                System.out.println("It's a Saturday");
                break;
            case 7:
                System.out.println("It's a Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
