package com.syntexpro.bytecraft11.date_time_api;

/*
    -> LocalDateTime is a built-in class in Java;
 */

import java.time.LocalDateTime;

public class DateTimeAPI {
    public static void main(String[] args) {


        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDateTime);
        System.out.println("Day: " + currentDateTime.getDayOfWeek());
        System.out.println("Date: " + currentDateTime.getDayOfMonth());
        System.out.println("Month: " + currentDateTime.getMonth());
        System.out.println("Year: " + currentDateTime.getYear());
        System.out.println("Day of the Year: " + currentDateTime.getDayOfYear());
        System.out.println("Minus 18 days from Current Date: " + currentDateTime.minusDays(18));
        System.out.println("Minus 12 weeks from Current Date: " + currentDateTime.minusWeeks(12));
        System.out.println("Minus 8 months from Current Date: " + currentDateTime.minusMonths(8));
        System.out.println("Minus 18 years from Current Date: " + currentDateTime.minusYears(18));
        System.out.println("Plus 108 days from current date: " + currentDateTime.plusDays(108));
        System.out.println("Plus 108 weeks from current date: " + currentDateTime.plusWeeks(108));
        System.out.println("Plus 108 months from current date: " + currentDateTime.plusMonths(108));
        System.out.println("Plus 108 years from current date: " + currentDateTime.plusYears(108));
//        System.out.println("Length of the month: " + currentDateTime.lengthOfMonth());
//        System.out.println("Length of the Year: " + currentDateTime.lengthOfYear());
//        System.out.println("Is 2024 a leap year: " + currentDateTime.isLeapYear());
//        System.out.println(currentDateTime.getEra());
        System.out.println(currentDateTime.getChronology());
//        System.out.println(currentDateTime.atStartOfDay());

        System.out.println("Current Time: " + currentDateTime);
        System.out.println("Hour: " + currentDateTime.getHour());
        System.out.println("Minute: " + currentDateTime.getMinute());
        System.out.println("Seconds: " + currentDateTime.getSecond());
        System.out.println("Nano Seconds: " + currentDateTime.getNano());
//        System.out.println("Total nanoseconds from midnight until the current time: " + currentDateTime.toNanoOfDay());
//        System.out.println("Total seconds from midnight until the current time: " + currentDateTime.toSecondOfDay());
        System.out.println("Minus 12 hours from now: " + currentDateTime.minusHours(12));
        System.out.println("Minus 12 minutes from now: " + currentDateTime.minusMinutes(12));
        System.out.println("Minus 1200 Seconds from now: " + currentDateTime.minusSeconds(1200));
        System.out.println("Minus 123456789 Nanoseconds from now: " + currentDateTime.minusNanos(123456789));
        System.out.println("Plus 12 hours from now: " + currentDateTime.plusHours(12));
        System.out.println("Plus 12 minutes from now: " + currentDateTime.plusMinutes(12));
        System.out.println("Plus 1200 seconds from now: " + currentDateTime.plusSeconds(1200));
        System.out.println("Plus 123456789 Nanoseconds from now: " + currentDateTime.plusNanos(123456789));

    }
}
