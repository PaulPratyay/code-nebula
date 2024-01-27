package com.syntexpro.bytecraft9.statickeyword;

public class CounterProgramWithStaticVariable {

    static int count = 0;

    CounterProgramWithStaticVariable () {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        CounterProgramWithStaticVariable obj1 = new CounterProgramWithStaticVariable();
        CounterProgramWithStaticVariable obj2 = new CounterProgramWithStaticVariable();
        CounterProgramWithStaticVariable obj3 = new CounterProgramWithStaticVariable();

        /*
            -> Here, it has only one shared 'count' variable for the entire class;
            -> Each time the constructor is called, is increments the shared 'count';
            -> As a result, the count is cumulative across all instances;
         */
    }
}
