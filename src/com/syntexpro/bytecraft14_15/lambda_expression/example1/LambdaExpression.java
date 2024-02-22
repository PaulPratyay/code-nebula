package com.syntexpro.bytecraft14_15.lambda_expression.example1;

public class LambdaExpression {
    public static void main(String[] args) {

        int width = 10, height = 20;

        // Without using lambda expression

        Measurement measure = new Measurement() {
            @Override
            public void measurement() {
                System.out.println("Width: " + width);
            }
        };
        measure.measurement();

        // Using lambda expression

        Measurement measure1 = () -> {
            System.out.println("Height: " + height);
        };
        measure1.measurement();


    }
}
