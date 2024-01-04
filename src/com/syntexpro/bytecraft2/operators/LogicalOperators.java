package com.syntexpro.bytecraft2.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        /*                                  TRUTH TABLE

        AND OPERATION                               OR OPERATION                       NOT OPERATION
        TRUE && TRUE = TRUE                        TRUE || TRUE = TRUE                 TRUE = FALSE
        TRUE && FALSE = FALSE                      TRUE || FALSE = TRUE                FALSE = TRUE
        FALSE && TRUE = FALSE                      FALSE || TRUE = TRUE
        FALSE && FALSE = FALSE                     FALSE || FALSE = FALSE
        (both true, then true                       (both false, then false
            except that,all false)                      except that, all true)
                                                                                                            */

        int a = 15, b = 20, c = 10;
        //AND OPERATION
        System.out.println("'LOGICAL AND OPERATION'");
        boolean andTrueTrue = (a > c) && (b > c);
        System.out.println(andTrueTrue);
        boolean andTrueFalse = (c < a) && (c > b);
        System.out.println(andTrueFalse);
        boolean andFalseTrue = (a > b) && (b > c);
        System.out.println(andFalseTrue);
        boolean andFalseFalse = (a < c) && (c > b);
        System.out.println(andFalseFalse);
        System.out.println("\n");

        //OR OPERATION
        System.out.println("'LOGICAL OR OPERATION'");
        boolean orTrueTrue = (a > c) || (c < b);
        System.out.println(orTrueTrue);
        boolean orTrueFalse = (a < b) || (b > c);
        System.out.println(orTrueFalse);
        boolean orFalseTrue = (b < c) || (a > c);
        System.out.println(orFalseTrue);
        boolean orFalseFalse = (a < c) || (c > b);
        System.out.println(orFalseFalse);
        System.out.println("\n");

        //NOT OPERATION
        System.out.println("'LOGICAL NOT OPERATION");
        System.out.println(!orFalseFalse);
        System.out.println(!andTrueTrue);

        boolean x = true;
        boolean y = false;
        System.out.println(!x);
        System.out.println(!y);
        //Make sure to use boolean data type while using Logical NOT Operator

    }
}
