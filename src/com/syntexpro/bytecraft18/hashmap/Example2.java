package com.syntexpro.bytecraft18.hashmap;

import java.util.HashMap;
import java.util.Map;

// No Duplicate Key on HashMap
public class Example2 {
    public static void main(String[] args) {

        // Creating HashMap

        HashMap<Integer, String> map = new HashMap<>();

        // Putting elements in Map

        map.put(1, "Mango");
        map.put(2, "Strawberry");
        map.put(3, "Apple");
        map.put(4, "Avocado");
        map.put(5, "Orange");
        map.put(6, "Grapes");
        map.put(7, "Berries");
        map.put(7, "Pineapple"); // trying duplicate key

        System.out.println(map + "\n");
        System.out.println("Iterating HashMap using for-each loop");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        System.out.println("Iterating HashMap using traditional for loop");

        for (int i = 0; i < map.size(); i++) {
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) map.entrySet().toArray()[i];
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);

        }


    }


}
