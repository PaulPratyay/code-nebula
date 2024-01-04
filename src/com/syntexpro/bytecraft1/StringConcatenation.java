package com.syntexpro.bytecraft1;

public class StringConcatenation {
    public static void main(String[] args) {

        String firstName = "Pratyay", lastName = "Paul";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        String fullNameWithSpace = firstName + " " + lastName;
        System.out.println(fullNameWithSpace);

        String firstString = "The quick brown fox ", secondString = "jumps over ", thirdString = "the lazy dog.";
        String fourthString = firstString + secondString + thirdString;
        System.out.println(fourthString);

        String alpha = "Happy", beta = "Coding!!";
        String alphaBeta = alpha + " " + beta;
        System.out.println(alphaBeta);

        //Concatenate with integer number

        int age = 27;
        String myAge = "This new year 2024, I will be ";
        System.out.println(myAge + age + " years old. ");

    }
}
