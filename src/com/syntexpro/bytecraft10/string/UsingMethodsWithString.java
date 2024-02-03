package com.syntexpro.bytecraft10.string;

public class UsingMethodsWithString {
    public static void main(String[] args) {

        // Trying different Java built-in methods using String

        String str1 = "In Java, 'String' is basically an object that represents sequence of char values.";

        // toUpperCase();

        System.out.println("UPPER CASE: " + str1.toUpperCase() + "\n");

        // toLowerCase();

        System.out.println("lower case: " + str1.toLowerCase() + "\n");

        // length();

        System.out.println("Length of the String: " + str1.length() + "\n");

        // substring();

        System.out.println("Substring: " + str1.substring(9));  // substring counting starts from '0'
        System.out.println("Substring UPPER CASE: " + str1.substring(9).toUpperCase());
        System.out.println("Substring lower case: " + str1.substring(9).toLowerCase());
        System.out.println(str1.substring(10, 16).toUpperCase() + "\n");

        // charAt();

        System.out.println("Printing a character from the String: " + str1.charAt(10) + "\n");

        // startWith();

        System.out.println("Checks if the String starts with: " + str1.startsWith("In Java"));
        System.out.println("Checks if the String starts with: " + str1.startsWith("In Python,"));

        // endsWith();

        System.out.println("Checks if the String ends with: " + str1.endsWith("char values."));
        System.out.println("Checks if the String ends with: " + str1.endsWith("byte values.") + "\n");

        String musicBand = "    Meghdol    ";

        // trim(); -> It removes beginning and ending spaces of a string

        System.out.println(musicBand);
        System.out.println(musicBand.trim() + "\n");

        // replace();

        System.out.println("Replace character: " + musicBand.replaceAll("M", "m") + "\n");

        String str2 = "", str3 = " ";

        // isEmpty();

        System.out.println("String Empty: " + str2.isEmpty());
        System.out.println("String Empty: " + str3.isEmpty() + "\n");

        // isBlank();

        System.out.println("String Blank: " + str2.isBlank());
        System.out.println("String Blank: " + str3.isBlank() + "\n");

        // equals();

        String isTopicName = "Java String";

        if (isTopicName.equals("Java String")) {
            System.out.println("Correct");
        }
        if (isTopicName.equals("Constructor")) {
            System.out.println("Incorrect");
        }


    }
}
