package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumUsingSwitch {

    enum Directions {
            NORTH, SOUTH, EAST, WEST
    }

    public static void main(String[] args) {

        Directions directions = Directions.WEST;

        switch (directions) {
            case NORTH:
                System.out.println("Heading North");
                break;
            case SOUTH:
                System.out.println("Heading South");
                break;
            case EAST:
                System.out.println("Heading East");
                break;
            case WEST:
                System.out.println("Heading West");
                break;
            default:
                System.out.println("Unknown directions");
        }
    }
}
