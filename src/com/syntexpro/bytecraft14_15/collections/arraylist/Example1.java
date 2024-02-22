package com.syntexpro.bytecraft14_15.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Adding object in ArrayList

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Avocado");

        System.out.println(fruits);
        System.out.println();

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println();

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        System.out.println();

        System.out.println(fruits.remove(3));
        System.out.println(fruits.get(3));
        System.out.println(fruits);
        System.out.println();

        System.out.println(fruits.contains("Grapes"));
        System.out.println(fruits.get(2).isEmpty());
        System.out.println(fruits.get(3).length());
        System.out.println(fruits.isEmpty());
        System.out.println();

        System.out.println(fruits.size());
        System.out.println();

        // Traversing list through for-each loop

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();

        // Traversing list through iterator

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }


}
