package com.syntexpro.bytecraft5.conditionalstatements;

public class SwitchStatement {
    public static void main(String[] args) {

        /*
        -> 'switch' statement is used for multiple-branch decision-making based on the value of an expression;
        -> It is often used when we have a single expression that we want to compare against multiple possible values;
        -> Remember to use 'break' statement after each 'case' to exit the 'switch' block;

         */

        int foodOrder = 1;

        switch (foodOrder) {
            case 1:
                System.out.println("Your \'Briyani\' order is placed. Thank you for your order!");
                break;
            case 2:
                System.out.println("Your \'Pizza\' order is placed. Thank you for your order!");
                break;
            case 3:
                System.out.println("Your \'Strawberry Pie\' order is placed. Thank you for your order!");
                break;
            case 4:
                System.out.println("Your \'Mango Milkshake\' order is placed. Thank you for your order!");
                break;
            case 5:
                System.out.println("Your \'Coconut Water\' order is placed. Thank you for your order!");
                break;
            default:
                System.out.println("Please order your food manually");


        }
    }
}
