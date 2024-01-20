package com.syntexpro.bytecraft8.var;

public class TypeInference {
    public static void main(String[] args) {

        String name = "Java";
        int age = 25;
        byte salary = 100;
        short price = 1000;
        long distance = 3175676134L;
        boolean isAdult = true;


        /*
          var
        -> 'var' is a type inference keyword;
        -> 'var' can only be used locally as a local variable;
        -> 'var' consider its data type based on it's input;

         */

        var name1 = "Docker";
        var age1 = 28;
        var salary1 = 120;
        var price1 = 2356;
        var distance1 = 371688643;

        System.out.println(distance1);

    }
}
