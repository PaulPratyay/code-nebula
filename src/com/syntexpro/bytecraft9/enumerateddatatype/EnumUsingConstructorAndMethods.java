package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumUsingConstructorAndMethods {

    enum CoffeeSize {
        SMALL(8), MEDIUM(12), LARGE(16);

        final int  ounces;

        CoffeeSize(int ounces) {
            this.ounces = ounces;
        }

        public int getOunces(){
            return ounces;
        }

        public String getLabel() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    public static void main(String[] args) {

        CoffeeSize smallSize = CoffeeSize.SMALL;
        CoffeeSize mediumSize = CoffeeSize.MEDIUM;
        CoffeeSize largeSize = CoffeeSize.LARGE;

        System.out.println("Small Size: " + smallSize.getOunces() + " ounces");
        System.out.println("Medium Size: " + mediumSize.getOunces() + " ounces");
        System.out.println("Large Size: " + largeSize.getOunces() + " ounces\n");

        System.out.println("Label for Small: " + largeSize.getLabel());
        System.out.println("Label for Medium: " + mediumSize.getLabel());
        System.out.println("Label for Small: " + smallSize.getLabel());


    }
}
