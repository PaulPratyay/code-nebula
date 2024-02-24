package com.syntexpro.bytecraft17;

import java.util.ArrayList;

public class PairSumExample2 {
    public static void main(String[] args) {

        /*
        Program to find the pairs in the given list whose summation is equal to 5
        List = 1 2 3 4 5; Target Sum = 5;
        So, which are the pairs if we add will get result of 5?
         */

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        System.out.println("List = " + list);

        findPairs(list, 5);


    }

    public static void findPairs(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    System.out.println("Pair Found: " + list.get(i) + ", " + list.get(j));
                }
            }

        }
    }
}
