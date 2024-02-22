package com.syntexpro.bytecraft14_15.lambda_expression.example4;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class LENoParameter {
    public static void main(String[] args) {

        Sayable sayable = () -> {
            return "Lambda expression provides a clear and concise way to represent one method interface using an expression";  // We need to use curly braces '{}' when using return keyword
        };
        System.out.println(sayable.say());

        Sayable say = () -> {
            return "It saves a lot of code";  // We need to use curly braces '{}' when using return keyword
        };
        System.out.println(say.say());
    }
}
