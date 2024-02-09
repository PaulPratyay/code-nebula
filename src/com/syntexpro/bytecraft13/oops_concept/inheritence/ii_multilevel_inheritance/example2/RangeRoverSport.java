package com.syntexpro.javaclass13.oops_concept.inheritance.ii_multilevel_inheritance.example2;

public class RangeRoverSport extends Car{

    public void highEndAppearance() {
        System.out.println("Range Rover Sports has a high-end appearance with soft-touch materials and a vast array of customization");
    }

    @Override
    public void seats() {
        System.out.println("Range Rover Sports have an elevated seating position");
    }

    @Override
    public void sunRoof() {
        System.out.println("It has sun roofs or moon roofs");
    }

    @Override
    public void engine() {
        System.out.println("It has a very powerful engine");
    }

    @Override
    public void transmission() {
        super.transmission();
    }

    @Override
    public void fuel() {
        System.out.println("Although it operates on fuel, but an fully electric version is on the way");
    }

    public static void main(String[] args) {

        RangeRoverSport rover = new RangeRoverSport();

        rover.highEndAppearance();
        rover.seats();
        rover.sunRoof();
        rover.engine();
        rover.transmission();
        rover.fuel();
    }
}
