package com.syntexpro.bytecraft3;

public class EscapeCharacters {
    public static void main(String[] args) {

        //Difference between 'println' and 'print' method in java

        //No new line is created while using 'print'
        System.out.print("This is a ");
        System.out.println("single line.");

        //New line is created while using 'println'
        System.out.println("This is on one line.");
        System.out.println("This is on the next line.");

        /*
        Escape Characters
        \t inserts a tab
        \b inserts a backspace
        \n inserts a newline
        \' inserts a single quotation
        \" inserts a double quotation
        \\ inserts a backslash
        \r carriage return; It basically removes whatever is written before \r
        \f form  feed
         */

        // \t
        System.out.println("I love my country\tBangladesh.");
        System.out.println("I love my country Bangladesh.");

        // \b
        System.out.println("I loves\b Coding.");

        // \n
        System.out.println("Happy Coding!!\n");
        System.out.println("Java");

        // \'
        System.out.println("Learning 'Java' is fun");
        System.out.println("Learning \'Java\' is fun");

        // \"
        System.out.println("\"The quick brown fox jumps over the lazy dog\"");

        // \\
        System.out.println("\\Java Programming\\");

        // \r -> Carriage return
        //prints only characters written after \r
        System.out.println("Hello\rWorld");
        System.out.println("Pratyay\rPaul");
        System.out.println("I love\rCricket");

        // \f -> form feed
        System.out.println("Soccer is one of my\ffavorite sport.");
        System.out.println("Hello\fWorld!!");

    }
}
