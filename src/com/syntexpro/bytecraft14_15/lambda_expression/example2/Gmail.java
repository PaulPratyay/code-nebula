package com.syntexpro.bytecraft14_15.lambda_expression.example2;

public class Gmail implements EmailSender {

    @Override
    public void send() {
        System.out.println("Sending mail using Google mail");
    }
}
