package com.syntexpro.bytecraft16.multidimensional_array;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        /*
        Program to print the following using multidimensional array
        List1 = 1 2 3 4 5;
        List2 = 2 4 6 8 10;
        List3 = 3 6 9 12 15
         */


        ArrayList<ArrayList<Integer>> parentList = new ArrayList<>();

        ArrayList<Integer> childList1 = new ArrayList<>();
        ArrayList<Integer> childList2 = new ArrayList<>();
        ArrayList<Integer> childList3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            childList1.add(i);
            childList2.add(i * 2);
            childList3.add(i * 3);
        }

        parentList.add(childList1);
        parentList.add(childList2);
        parentList.add(childList3);

        System.out.println(parentList);

        for (int i = 0; i < parentList.size(); i++) {
            ArrayList<Integer> currentList = parentList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }

        childList1.remove(2);
        childList2.remove(1);
        childList3.remove(4);

        System.out.println(parentList);
    }
}
