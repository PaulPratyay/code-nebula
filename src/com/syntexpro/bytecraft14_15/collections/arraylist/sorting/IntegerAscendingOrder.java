package com.syntexpro.bytecraft14_15.collections.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerAscendingOrder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(55);
        list.add(34);
        list.add(98);
        list.add(67);
        list.add(39);
        list.add(76);
        list.add(81);

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);
        System.out.println("Sorted in Ascending Order: " + list);
    }
}
