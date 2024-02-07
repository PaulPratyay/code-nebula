package com.syntexpro.bytecraft11.big_decimal;

import java.math.BigDecimal;

public class Example {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("0.02");
        BigDecimal num2 = new BigDecimal("0.01");

        System.out.println(num1.subtract(num2));
        System.out.println(num1.add(num2));
        System.out.println(num1.divide(num2));
        System.out.println(num2.multiply(num1));

        double a = 0.0005, b = 0.0004;
        System.out.println(a - b);
    }
}
