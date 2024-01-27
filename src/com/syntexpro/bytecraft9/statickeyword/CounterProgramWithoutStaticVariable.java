package com.syntexpro.bytecraft9.statickeyword;

public class CounterProgramWithoutStaticVariable {

    int count = 0;

    CounterProgramWithoutStaticVariable() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        CounterProgramWithoutStaticVariable obj1 = new CounterProgramWithoutStaticVariable();
        CounterProgramWithoutStaticVariable obj2 = new CounterProgramWithoutStaticVariable();
        CounterProgramWithoutStaticVariable obj3 = new CounterProgramWithoutStaticVariable();

        /*
            -> Each object ('obj1', 'obj2', and 'obj3') has its own 'count' variable;
            -> The constructor increments and prints the count for each instance independently;
         */

    }
}
