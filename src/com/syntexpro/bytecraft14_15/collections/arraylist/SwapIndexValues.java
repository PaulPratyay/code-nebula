package com.syntexpro.bytecraft14_15.collections.arraylist;

import java.util.ArrayList;

public class SwapIndexValues {
    public static void main(String[] args) {

        // Program to swap values between indexes; [index 2 & index 5]

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(42);
        list.add(108);
        list.add(62);
        list.add(79);
        list.add(54);
        list.add(118);

        System.out.println("List = " + list);

        int index1 = 2, index2 = 5;
        swapIndexValues(list, index1, index2);
        System.out.println("Swapped values of index 2 & index 5: " + list);
    }

    public static void swapIndexValues(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
