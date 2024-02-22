package com.syntexpro.bytecraft14_15.lambda_expression.example3;

import com.syntexpro.bytecraft13.oops_concept.inheritence.iv_multiple_inheritance.example1.Fruits;

public class Jackfruit {
    public static void main(String[] args) {

        Fruit fruit = () -> System.out.println("The jackfruit is the national fruit of Bangladesh");
        Fruit fruit1 = () -> {
            System.out.println("Tha main fruiting season for jackfruit is in summer and fall");
        };
        fruit.jackfruit();
        fruit1.jackfruit();
    }
}
