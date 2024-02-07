package com.syntexpro.bytecraft11.date_time_api;

/*
    LocalDateTime.now();
    -> Returns the current date and time in the local time zone without any timezone information;
    -> It's suitable for representing a date and time without regard to any specific timezone;
    ZoneDateTime.now();
    -> Returns the current date and time with timezone information;
    -> It includes the timezone offset from UTC/Greenwich, which allows for proper representation of dates and times across different timezones;        UTC - Coordinated Universal Time;
    Instant.now();
    -> Returns the current instant in time, represented as the number of seconds and nanoseconds since the epoch (midnight, January 1, 1970, UTC);
    -> It represents a point in time on the global timeline without any timezone or calendar information;
    -> Useful for measuring time durations or comparing timestamps across different timezones;

-> We use LocalDateTime.now() when we need the current date and time in the local timezone without timezone information;
-> We use ZoneDateTime.now() when we need the current date and time with timezone information for handling timezones;
-> We use Instant.now() when we need the current point in time on the global timeline for measuring durations or comparing timestamps;
 */


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class LocalZoneInstant {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now() + "\n");
        System.out.println(ZonedDateTime.now() + "\n");
        System.out.println(Instant.now() + "\n");
    }
}
