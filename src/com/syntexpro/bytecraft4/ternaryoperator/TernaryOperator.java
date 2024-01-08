package com.syntexpro.bytecraft4.ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
            variable = (condition) ? Statement1 : Statement2;
        ->The data type of the variable will be dependent on the type of Statement1 and Statement2;
         */

        boolean greaterNumber = (5 > 2) ? true : false;
        System.out.println(greaterNumber);

        greaterNumber = (5 < 2) ? true : false;
        System.out.println(greaterNumber);

        //OddEven

        int a = 5;
        String oddEven = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(oddEven);

        //LargeNumber

        int x = 35, y = 20;
        int result = (x > y) ? x : y;
        System.out.println(result);

        //Determining Grade

        int score = 92;
        char grade = (score >=60) ? 'P' : 'F';
        System.out.println("Your Grade: " + grade);

        //PositiveNegative

        int num = -2;
        String positiveNegative = (num > 0) ? "Positive Number" : "Negative Number";
        System.out.println(positiveNegative);



        //NestedTernary

        int P = 8;
        String type = (P % 2 == 0) ? ((P > 10) ? "Even and greater than 10" : "Even and less than or equal to 10") : "Odd";
        System.out.println("type: " + type);

        num = -5;
        positiveNegative = (num > 0) ? "Positive" :  (num < 0) ? "Negative" : "Zero";
        System.out.println(positiveNegative);

        int m = 83654, n = 94587, o = 83465;
        int greatNum = ((m > n) && (m > o)) ? + m : ((n > m) && (n > o)) ? + n : + o;
        System.out.println(greatNum);





    }
}
