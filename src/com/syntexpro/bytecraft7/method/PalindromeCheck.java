package com.syntexpro.bytecraft7.method;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner palindromeCheck = new Scanner(System.in);

        System.out.println("Enter a word or string: ");
        String wordOrSentence = palindromeCheck.nextLine();

        System.out.println(wordOrSentence + " is a palindrome: " + palindromeCheck(wordOrSentence));

    }

    public static boolean palindromeCheck(String wordOrSentence) {

        wordOrSentence = wordOrSentence.toLowerCase();
        wordOrSentence = wordOrSentence.replaceAll("[^a-zA-Z0-9]", "");

        int length = wordOrSentence.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (wordOrSentence.charAt(i) != wordOrSentence.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
