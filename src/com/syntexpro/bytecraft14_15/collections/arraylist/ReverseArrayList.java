package com.syntexpro.bytecraft14_15.collections.arraylist;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {

        // Program to print an ArrayList in reverse

        ArrayList<Integer> list = new ArrayList<>();

        // Adding objects in ArrayList

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("List = " + list);

        // Using 'reversed()' method

        System.out.println("Reverse List = " + list.reversed() + "\n");

        // Using for loop

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
