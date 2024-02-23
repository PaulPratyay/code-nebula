package com.syntexpro.bytecraft16.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(42);
        list.add(65);
        list.add(12);
        list.add(76);
        list.add(36);
        list.add(16);
        list.add(48);
        list.add(23);
        list.add(13);
        list.add(89);

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);                                     // By default, it sorts in Ascending Order;
        System.out.println("Sorted in Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting in Descending Order: " + list);
    }
}
