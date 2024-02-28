package com.syntexpro.bytecraft18.hashmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //Put elements in map

        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Orange");
        map.put(4, "Grapes");
        map.put(5, "Strawberry");
        map.put(6, "Avocado");

        System.out.println(map + "\n");
        System.out.println("Iterating HashMap: ");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        System.out.println("The size of the Map is: " + map.size());
        System.out.println("Value in Key 3: " + map.get(3));
        System.out.println("Value in Key 1: " + map.get(1));
        System.out.println("Is the Map Empty? " + map.isEmpty());
        System.out.println(map.remove(4));
        System.out.println(map);
        map.put(4, "Watermelon");
        System.out.println(map + "\n");

        for (int i = 0; i < map.size(); i++) {
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) map.entrySet().toArray()[i];
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);

        }

    }
}
