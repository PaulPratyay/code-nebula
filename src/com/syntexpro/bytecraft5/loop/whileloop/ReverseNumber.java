package com.syntexpro.bytecraft5.loop.whileloop;

public class ReverseNumber {
    public static void main(String[] args) {

        /*
        This program prints a number in reverse;
        For Example, 2024 will be printed as 4202
        */

        int num = 2024;
        int originalNumber = num;  // Store the original number
        int reverseNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num /= 10;
        }
        System.out.println();
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reverse number: " + reverseNumber);
    }
}
