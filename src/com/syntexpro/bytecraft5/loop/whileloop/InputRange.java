package com.syntexpro.bytecraft5.loop.whileloop;

import java.util.Scanner;

public class InputRange {
    public static void main(String[] args) {

        // This program takes the 'range' as input and prints from 1 to range;

        Scanner sc = new Scanner(System.in);

        int start = 1;

        System.out.println("Enter the range: ");
        int range = sc.nextInt();

        while (start <= range) {
            System.out.println("Bangladesh");
            start++;
        }


    }
}
