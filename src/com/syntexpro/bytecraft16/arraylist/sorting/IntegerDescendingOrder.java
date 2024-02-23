package com.syntexpro.bytecraft16.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerDescendingOrder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(566);
        list.add(230);
        list.add(123);
        list.add(110);
        list.add(689);
        list.add(12);
        list.add(95);

        System.out.println("Before Sorting: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + list);

    }
}
