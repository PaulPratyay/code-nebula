package com.syntexpro.bytecraft16.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringAscendingOrder {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // adding elements to the ArrayList

        list.add("Volkswagen");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Range Rover");
        list.add("Rolls-Royce");
        list.add("BMW");

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);
        System.out.println("Sorted in Ascending Order: " + list);
    }
}
