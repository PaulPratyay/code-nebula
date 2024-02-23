package com.syntexpro.bytecraft16.arraylist;

import java.util.ArrayList;

public class SwapIndexValues {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volkswagen");
        cars.add("Toyota");
        cars.add("Porsche");
        cars.add("Ferrari");
        cars.add("Mercedes-Benz");
        cars.add("Range Rover");
        cars.add("Rolls-Royce");
        cars.add("BMW");

        System.out.println("Cars = " + cars);

        int index1 = 0, index2 = 5;
        swapIndexValues(cars, index1, index2);
        System.out.println("Swapped values of Index 0 & Index 5 = " + cars);

    }

    public static void swapIndexValues(ArrayList<String> cars, int index1, int index2) {
        String temp = cars.get(Integer.parseInt(String.valueOf(index1)));
        cars.set(Integer.parseInt(String.valueOf(index1)), cars.get(Integer.parseInt(String.valueOf(index2))));
        cars.set(Integer.parseInt(String.valueOf(index2)), temp);


    }
}
