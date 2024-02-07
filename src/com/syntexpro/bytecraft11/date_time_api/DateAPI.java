package com.syntexpro.bytecraft11.date_time_api;

/*
    -> The java.time, java.util. java.sql and java.text packages contains classes for representing date and time;
    -> 'java.time.LocalDate class', 'java.time.LocalTime class', 'java.time.LocalDateTime class' are java built-in classes;
    -> There many other classes under java.time.;
 */

import java.time.LocalDate;

public class DateAPI {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Day: " + currentDate.getDayOfWeek());
        System.out.println("Date: " + currentDate.getDayOfMonth());
        System.out.println("Month: " + currentDate.getMonth());
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Day of the year: " + currentDate.getDayOfYear());
        System.out.println("Minus 18 days from current date: " + currentDate.minusDays(18));
        System.out.println("Minus 12 weeks from current date: " + currentDate.minusWeeks(12));
        System.out.println("Minus 8 months from current date: " + currentDate.minusMonths(8));
        System.out.println("Minus 18 years from current date: " + currentDate.minusYears(18));
        System.out.println("Plus 108 days from current date: " + currentDate.plusDays(108));
        System.out.println("Plus 108 weeks from current date: " + currentDate.plusWeeks(108));
        System.out.println("Plus 108 months from current date: " + currentDate.plusMonths(108));
        System.out.println("Plus 108 years from current date: " + currentDate.plusYears(108));
        System.out.println("Length of the month: " + currentDate.lengthOfMonth());
        System.out.println("Length of the year: " + currentDate.lengthOfYear());
        System.out.println("Is 2024 a leap year: " + currentDate.isLeapYear());
        System.out.println(currentDate.getEra());
        System.out.println(currentDate.getChronology());
        System.out.println(currentDate.atStartOfDay());

    }
}
