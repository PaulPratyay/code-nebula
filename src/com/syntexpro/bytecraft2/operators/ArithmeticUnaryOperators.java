package com.syntexpro.javaclass2.operators;

public class ArithmeticUnaryOperators {
    public static void main(String[] args) {

        //Increment
        int a = 10;
        a++;
        System.out.println("a = " + a);
        //Decrement
        int b = 12;
        b--;
        System.out.println("b = " + b);
        //Post Increment -> First assigned and then incremented
        int c = 4;
        int d = c++;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        /* How Post Increment works:
         1) int c = 4; Here, I have initialize the variable 'c' with the value '4'
         2) int d = c++; In this line I have used the post-increment operator. The post-increment operator ('c++') first assigns the current value of 'c' to 'd' and then increments the value of 'c'.
            So, 'd' gets the original value of 'c' (which is '4'), and then 'c' is incremented to '5'
         3) System.out.println(c); Print the current value of 'c', which is now '5'
         4) System.out.println(d); Prints the value of 'd', which was assigned the original value of 'c' before the increment operation, so it's '4'
         */
        //Pre Increment -> First incremented and then assigned
        int e = 12;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        /* How Pre Increment works:
        1) int e = 12; Here, I have initialize the variable 'e' with the value '12'
        2) int f = ++e; In this line I have used the pre increment operator. The pre-increment operator ('++e') first  increments the value of 'e' and then assigns the result to 'f'.
           So, 'e' is incremented to '13', and 'f' is assigned the value '13'.
        3) System.out.println(e); Prints the current value of 'e', which is now '13'
        4) System.out.println(f); Prints the value of 'f', which was assigned the incremented value of 'e', so it's also '13'
        With pre-increment operator, the increment operation occurs before the assignment, resulting in both 'e' and 'f' having the same incremented value.
        */

        //Post-Decrement (First assign and then decrement)
        int g = 15;
        int h = g--;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        //Pre-Decrement (First decrement and then assign)
        int i = 18;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
