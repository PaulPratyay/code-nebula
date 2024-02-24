package com.syntexpro.bytecraft17;

import java.util.ArrayList;

public class PairSumExample1 {
    public static void main(String[] args) {

        /*
        Program to find the pairs in the given list whose summation is equal to 5
        List = 1 2 3 4 5; Target Sum = 5;
        So, if there are pairs which will give summation of 5, print 'true';
         */

        ArrayList<Integer> list = new ArrayList<>();

        // adding objects in the ArrayList

        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        System.out.println("List = " + list);

        System.out.println(pairSum(list, 5));
    }

    public static boolean pairSum(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }
}
