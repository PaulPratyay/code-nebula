package com.syntexpro.bytecraft18.hashmap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

// Trying D\different ways to replace elements
public class Example5 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Alice");
        hm.put(102, "Bob");
        hm.put(103, "Charlie");
        hm.put(104, "John");
        hm.put(105, "David");
        hm.put(106, "Freddy");

        System.out.println("List of students: ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        hm.replace(103, "Williams");
        hm.replace(105, "Doe");
        System.out.println("Updated list of students: ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        hm.replace(102, "Bob", "Brendon");
        hm.replace(106, "Freddy", "Jane");

        System.out.println("Updated students list: ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        hm.replaceAll((k, v) -> "Robert Williams");

        System.out.println("Updated students list:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
