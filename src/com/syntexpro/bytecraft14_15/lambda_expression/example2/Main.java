package com.syntexpro.bytecraft14_15.lambda_expression.example2;

public class Main {
    public static void main(String[] args) {

        Gmail gmail = new Gmail();
        gmail.send();

        // Another way to call a class and create object for that class

        EmailSender gmail1 = new Gmail();
        gmail1.send();
        System.out.println();

        Hotmail hotmail = new Hotmail();
        hotmail.send();

        // Another way to call a class and create object for that class

        EmailSender hotmail1 = new Hotmail();
        hotmail1.send();
        System.out.println();

        // Without using lambda expression

        System.out.println("Without using Lambda Expression:");
        EmailSender emailSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Send mail using Google mail and receive mail using Hotmail");
            }
        };
        emailSender.send();
        System.out.println();

        // Using Lambda Expression

        System.out.println("Using Lambda Expression");
        EmailSender emailSender1 = () -> {
            System.out.println("Sending mail using Google mail and receiving mail using Hotmail");
        };
        emailSender1.send();
        System.out.println();

        EmailSender gmail2 = () -> System.out.println("Gmail");
        EmailSender hotmail2 = () -> System.out.println("Hotmail");
        gmail2.send();
        hotmail2.send();
        System.out.println();


    }
}
