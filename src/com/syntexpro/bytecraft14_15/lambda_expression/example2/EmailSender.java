package com.syntexpro.bytecraft14_15.lambda_expression.example2;

@FunctionalInterface
public interface EmailSender {

    void send();

    // We can use default method with body in interface
    default void test() {
        System.out.println("ABC");
    }
}
