package com.syntexpro.bytecraft14_15.lambda_expression.example5;

public class LESingleParameter {
    public static void main(String[] args) {

        Sayable sayable = (name) -> {
            return name;
        };
        System.out.println(sayable.sayable("Lambda Expression"));

        Sayable say = (name) -> {
            return name + " is treated as a function, so compiler does not create .class file";
        };
        System.out.println(say.sayable("Lambda Expression"));

        // We can use single parameter without using parenthesis

        Sayable sayable1 = name -> {
            return name + " can be only be used in an interface";
        };
        System.out.println(sayable1.sayable("Lambda Expression"));
    }
}
