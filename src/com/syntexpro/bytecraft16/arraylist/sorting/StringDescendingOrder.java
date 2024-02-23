package com.syntexpro.bytecraft16.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringDescendingOrder {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Data Science");
        list.add("Testing");
        list.add("C#");
        list.add("Basic Language");
        list.add("Java");
        list.add("UML");
        list.add("Algorithms");
        list.add("Computer Networks");
        list.add("Python;");

        System.out.println("Before Sorting: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + list);

    }
}
