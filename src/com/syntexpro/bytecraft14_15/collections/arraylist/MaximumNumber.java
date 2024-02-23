package com.syntexpro.bytecraft14_15.collections.arraylist;

import java.util.ArrayList;

public class MaximumNumber {
    public static void main(String[] args) {

        // Program to print the maximum number from an ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        // Adding objects in the ArrayList

        list.add(17);
        list.add(10);
        list.add(18);
        list.add(54);
        list.add(108);
        list.add(95);

        System.out.println(list);

        int max = list.getFirst();


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {                // the logic can also be (max < list.get(i))
                max = list.get(i);
            }
        }
        System.out.println("Maximum number in the ArrayList: " + max + "\n");

        // Another way to find the maximum number from the ArrayList

        System.out.println(list);

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {        // the logic can also be (maximum < list.get(i))
                maximum = list.get(i);
            }
        }
        System.out.println("Maximum number in the ArrayList: " + maximum + "\n");

        // Another way to find the maximum number from the ArrayList
        // Using 'Math' class and 'max' method

        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum number in the ArrayList: " + max);


    }
}
