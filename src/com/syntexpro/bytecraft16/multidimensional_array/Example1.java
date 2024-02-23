package com.syntexpro.bytecraft16.multidimensional_array;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> parentList = new ArrayList<>();

        ArrayList<Integer> childList1 = new ArrayList<>();
        childList1.add(1);
        childList1.add(4);

        parentList.add(childList1);

        ArrayList<Integer> childList2 = new ArrayList<>();
        childList2.add(2);
        childList2.add(5);

        parentList.add(childList2);

        System.out.println(parentList);

        for (int i = 0; i < parentList.size(); i++) {
            ArrayList<Integer> currentList = parentList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
