package com.syntexpro.bytecraft11.date_time_api;

/*
    'LocalTime' is a built-in class in Java;
 */

import java.time.LocalTime;

public class TimeAPI {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Time: " + currentTime);
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Seconds: " + currentTime.getSecond());
        System.out.println("Nanoseconds: " + currentTime.getNano());
        System.out.println("Total seconds from midnight until the current time: " + currentTime.toSecondOfDay());
        System.out.println("Total nanoseconds from midnight until the current time: " + currentTime.toNanoOfDay());
        System.out.println("Minus 12 hours from now: " + currentTime.minusHours(12));
        System.out.println("Minus 12 minutes from now: " + currentTime.minusMinutes(12));
        System.out.println("Minus 1200 Seconds from now: " + currentTime.minusSeconds(1200));
        System.out.println("Minus 123456789 Nanoseconds from now: " + currentTime.minusNanos(123456789));
        System.out.println("Plus 12 hours from now: " + currentTime.plusHours(12));
        System.out.println("Plus 12 minutes from now: " + currentTime.plusMinutes(12));
        System.out.println("Plus 1200 seconds from now: " + currentTime.plusSeconds(1200));
        System.out.println("Plus 123456789 Nanoseconds from now: " + currentTime.plusNanos(123456789));


    }
}
