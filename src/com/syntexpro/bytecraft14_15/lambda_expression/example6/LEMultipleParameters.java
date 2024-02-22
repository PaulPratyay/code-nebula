package com.syntexpro.bytecraft14_15.lambda_expression.example6;

public class LEMultipleParameters {
    public static void main(String[] args) {

        // multiple parameters

        Addition addition1 = (a, b) -> (a + b);
        System.out.println("Addition Result: " + addition1.add(10, 8));

        // We can also use the data type in argument-list

        Addition addition2 = (int a, int b) -> (a + b);
        System.out.println("Addition Result: " + addition2.add(53, 65));

        // replacing lambda with method reference

        Addition addition3 = Integer::sum;
        System.out.println("Addition using method reference: " + addition3.add(53, 84));

        // Using return keyword

        Addition addition = (a, b) -> {
            return a + b;
        };
        System.out.println("Addition using return keyword: " + addition.add(54, 54));


    }
}
