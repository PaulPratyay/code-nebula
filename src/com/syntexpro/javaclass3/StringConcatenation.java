package com.syntexpro.javaclass3;

public class StringConcatenation {
    public static void main(String[] args) {

        String syntax = "Syntex", code = "pro";
        String brand = syntax + code;
        System.out.println(brand);
        String brandWithSpace = syntax + " " + code;
        System.out.println(brandWithSpace);

        String numString1 = "12-", numString2 = "31-", numString3 = "2023";
        String todayDate = numString1 + numString2 + numString3;
        System.out.println(todayDate);
    }
}
