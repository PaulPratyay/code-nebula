package com.syntexpro.bytecraft18.hashmap;

import java.util.HashMap;

public class Example4 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.putIfAbsent(1, "Freddy");
        map.putIfAbsent(2, "George");
        map.putIfAbsent(3, "Harry");
        map.putIfAbsent(3, "Maven");
        map.putIfAbsent(3, "Gradle");

        System.out.println(map);
        // When I am trying duplicate keys using 'putIfAbsent()' method, it is considering the 1st element and ignoring the rest elements

        map.put(4, "Icy");
        map.put(5, "Jack");
        map.put(6, "Kevin");
        map.put(6, "Linda");
        map.put(6,"Alice");

        System.out.println(map);
        // When I am trying duplicate keys using 'put()' method, it is considering the last element and ignoring the previous elements
    }
}
