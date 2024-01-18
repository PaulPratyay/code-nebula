package com.syntexpro.bytecraft6.dowhileloop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {



        int sum = 0;
        int number = 1;



        do {
            sum += number;
            number++;
        } while (number <= 12);

        System.out.println(sum);
    }


}
