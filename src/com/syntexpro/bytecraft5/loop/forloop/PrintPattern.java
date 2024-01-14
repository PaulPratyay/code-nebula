package com.syntexpro.bytecraft5.loop.forloop;

public class PrintPattern {
    public static void main(String[] args) {

        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
    -> When i = 1, the inner loop runs once (j = 1), and one asterisk is printed.
    -> When i = 2, the inner loop runs twice (j = 1 and j = 2), and two asterisks are printed.
    -> When i = 3, the inner loop runs three times (j = 1, j = 2, and j = 3), and three asterisks are printed.
    And so on...
  */
