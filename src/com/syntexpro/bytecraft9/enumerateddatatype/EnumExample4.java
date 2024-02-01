package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumExample4 {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day day = Day.THURSDAY;

        switch (day) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday");
                break;
            case THURSDAY:
                System.out.println("It's Thursday");
                break;
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            case SATURDAY:
                System.out.println("It's Saturday");
                break;
            case SUNDAY:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's not a special day");
        }
        System.out.println();
        System.out.println("Days in a week: ");
        for (Day daysInWeek : Day.values()) {
            System.out.println(daysInWeek);
        }
    }
}
