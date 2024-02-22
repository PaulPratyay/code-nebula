package com.syntexpro.bytecraft14_15.lambda_expression.example7;

public class Main {
    public static void main(String[] args) {

        Email email = (mailID) -> {
            return mailID;
        };
        System.out.println(email.email("lambda_expression@gmail.com"));

        Gmail gmail = new Gmail();
        System.out.println(gmail.email("le@gmail.com"));

        Hotmail hotmail = new Hotmail();
        System.out.println(hotmail.email("le@hotmail.com"));
    }
}
