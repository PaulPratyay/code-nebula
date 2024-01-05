package com.syntexpro.homework.variablesdatatypes;

public class Question4 {
    public static void main(String[] args) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14F;
        double d = 99.9954;

        /*
        result = (  f    * b) + ( i     % c)  - (d        * s);
               = (3.14F * 4)  + (1000 % 'a') - (99.9954 * 512)
         */

        double result = (f * b) + (i % c) - (d * s);

        System.out.println(result);



    }
}
