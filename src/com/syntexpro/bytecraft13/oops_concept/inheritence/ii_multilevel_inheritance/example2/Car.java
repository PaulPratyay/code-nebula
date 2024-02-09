package com.syntexpro.javaclass13.oops_concept.inheritance.ii_multilevel_inheritance.example2;

public class Car extends Vehicle {

    public void seats() {
        System.out.println("It can have leather seats");
    }

    public void sunRoof(){
        System.out.println("It can have sun roof which will allow more light and air into the car");
    }

    @Override
    public void engine() {
        System.out.println("Engine is the heart of a car");
    }

    @Override
    public void transmission() {
        System.out.println("Car transmission has gears or speeds");;
    }

    @Override
    public void fuel() {
        super.fuel();
    }

    public static void main(String[] args) {

        Car car = new Car();

        car.seats();
        car.sunRoof();
        car.engine();
        car.transmission();
        car.fuel();
    }
}
