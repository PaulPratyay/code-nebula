package com.syntexpro.bytecraft11.big_decimal;

/*
    -> The BigDecimal class provides operation for arithmetic, comparison, hashing, rounding, manipulation and format conversion;
    -> This method can handle very small and very big floating point numbers with great precision;
 */

import java.math.BigDecimal;

public class BigDecimalTopic {
    public static void main(String[] args) {

        double number1 = 0.02;
        double number2 = 0.03;
        double result = (number2 - number1);
        System.out.println(result);

        BigDecimal num1 = new BigDecimal("0.02");
        BigDecimal num2 = new BigDecimal("0.03");
        BigDecimal result1 = num2.subtract(num1);
        System.out.println(result1);

        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));

    }
}
