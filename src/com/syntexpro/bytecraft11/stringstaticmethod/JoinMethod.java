package com.syntexpro.bytecraft11.stringstaticmethod;

/*
    join();
    -> It is used to concatenate multiple strings or CharSequence objects into a single string;
    -> It provides a convenient way to join elements of a collection or an array with a specific delimiter;

delimiter: The delimiter that separates the elements in the resulting string;
elements: The elements to be joined;
 */

public class JoinMethod {
    public static void main(String[] args) {

        String[] words = {"Hello", "Java!", "Happy", "Coding"};
        String concatWords = String.join(" ", words);
        System.out.println(concatWords);

        String[] rainbow = {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
        String rainbowColors = String.join("|", rainbow);
        System.out.println(rainbowColors);


    }
}
