package com.syntexpro.homework.variablesdatatypes;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner writingToolsBill = new Scanner(System.in);

        System.out.println("Enter the cost of pencil: ");
        double pencil = writingToolsBill.nextDouble();

        System.out.println("Enter the cost of pen: ");
        double pen = writingToolsBill.nextDouble();

        System.out.println("Enter the cost of eraser: ");
        double eraser = writingToolsBill.nextDouble();

        double totalBill = (pencil + pen + eraser) * ((double) 18/100) + (pencil + pen + eraser);

        System.out.println("You total bill: $" + totalBill);
    }
}


//double sum = (pencil + pen + eraser);
//double gstTax = (double) 18/100 * sum;
//double totalBill = sum + gstTax;