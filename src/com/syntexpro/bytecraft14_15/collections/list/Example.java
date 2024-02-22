package com.syntexpro.bytecraft14_15.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> rainbowColors = new ArrayList<>();

        rainbowColors.add("Violet");
        rainbowColors.add(("Indigo"));
        rainbowColors.add("Blue");
        rainbowColors.add("Green");
        rainbowColors.add("Pink");
        rainbowColors.add("Yellow");
        rainbowColors.add("Orange");
        rainbowColors.add("Red");

        System.out.println(rainbowColors);
        System.out.println();

        for (String color : rainbowColors) {
            System.out.println(color);
        }
        System.out.println();

        System.out.println(rainbowColors.remove(4));
        System.out.println(rainbowColors);
        System.out.println(rainbowColors.get(4));
        System.out.println(rainbowColors.size());
        System.out.println(rainbowColors.isEmpty());
        System.out.println(rainbowColors.get(2).length());
        System.out.println();

        System.out.println(rainbowColors.get(5).isEmpty());
        System.out.println(rainbowColors.get(0).isBlank());
        System.out.println();

        System.out.println(rainbowColors.contains("Black"));
        System.out.println(rainbowColors.getFirst());
        System.out.println(rainbowColors.getLast());
    }


}
