package com.syntexpro.homework.operators;

public class Question1 {
    public static void main(String[] args) {

        int x = 2, y = 5;

        int exp1 = (x * y / x);                           // exp1 = 5
        int exp2 = (x * (y / x));                        // exp2 = 4

        System.out.println(exp1 + " , ");               // 5 ,
        System.out.println(exp2);                      // 4
    }
}
