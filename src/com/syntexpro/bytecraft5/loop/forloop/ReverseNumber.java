package com.syntexpro.bytecraft5.loop.forloop;

public class ReverseNumber {
    public static void main(String[] args) {

        //Print number 5 to 1 in reverse

        System.out.println("Printing numbers 5 to 1 in reverse: ");

        int num = 1;

        for (int i = 5; i >= num; i--) {
            System.out.print(+i + ", ");
        }
        System.out.println();
    }
}
