package com.syntexpro.javaclass2.operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //Logical Operators: ( == , != , > , >= , < , <=)

        // ==
        int a = 10, b = 20;
        boolean equalEqual = (a == b);
        System.out.println(equalEqual);
        // !=
        boolean notEqual = (a != b);
        System.out.println(notEqual);
        // >
        boolean greaterThan = (a > b);
        System.out.println(greaterThan);
        // <
        boolean lessThan = (a < b);
        System.out.println(lessThan);
        // >=
        boolean greaterThanEqual = (a >= b);
        System.out.println(greaterThanEqual);
        // <=
        boolean lessThanEqual = (a <= b);
        System.out.println(lessThanEqual); // if any one condition is true, it will print true

    }
}
