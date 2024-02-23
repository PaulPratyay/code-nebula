package com.syntexpro.bytecraft14_15.collections.arraylist;

import java.util.ArrayList;

public class MinimumNumber {
    public static void main(String[] args) {

        // Program to find the minimum number from an ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        // Adding object in the ArrayList

        list.add(17);
        list.add(10);
        list.add(8);
        list.add(54);
        list.add(108);
        list.add(5);

        System.out.println(list);

        int min = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {            // The logic can also be (list.get(i) < min)
                min = list.get(i);
            }
        }
        System.out.println("Minimum number in the ArrayList: " + min + "\n");

        // Another way to find the minimum number from the ArrayList

        System.out.println(list);

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (minimum > list.get(i)) {                    // The logic can also be (list.get(i) < minimum)
                minimum = list.get(i);
            }
        }
        System.out.println("Minimum number in the ArrayList: " + minimum + "\n");

        // Another way to find the minimum number from the ArrayList
        // Using 'Math' class and 'max()' method

        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i));
        }
        System.out.println("Minimum number in the ArrayList: " + min);

    }
}
