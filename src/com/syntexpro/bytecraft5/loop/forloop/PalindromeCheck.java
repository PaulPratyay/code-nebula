package com.syntexpro.bytecraft5.loop.forloop;

/*
    A palindrome is a word, number, phrase or other sequence of symbols that reads the same backwards as forwards.
    For example: madam <-> madam; level <-> level; deed <-> deed;
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner palindromeCheck = new Scanner(System.in);

        System.out.println("Enter a word or sentence: ");
        String wordOrSentence = palindromeCheck.nextLine();

        // Converting the wordOrSentence to lower case for case-insensitive comparison

        wordOrSentence = wordOrSentence.toLowerCase();

        // Replacing any non-alphanumeric characters with empty string

        wordOrSentence = wordOrSentence.replaceAll("[^a-zA-Z0-9]", "");

        // Storing the length of wordORSentence in 'length' variable

        int length = wordOrSentence.length();

        // Checking if the string is a palindrome

        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {

            if (wordOrSentence.charAt(i) != wordOrSentence.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(wordOrSentence + " is a Palindrome: " + isPalindrome);


    }
}
