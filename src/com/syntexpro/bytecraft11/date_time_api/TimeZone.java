package com.syntexpro.bytecraft11.date_time_api;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZone {
    public static void main(String[] args) {

        // Printing all the time zones of the world

        System.out.println("Different time zones of the world: ");

        for (String timeZone : ZoneId.getAvailableZoneIds()) {
            System.out.println(timeZone);
        }
        System.out.println();

        // Checking time zone for Asia/Dhaka

        LocalDateTime timeZoneInDhaka = LocalDateTime.now(ZoneId.of("Asia/Dhaka"));
        System.out.println("Time in Dhaka right now: " + timeZoneInDhaka + "\n");

        // Checking time zone for Asia/Dubai

        LocalDateTime timeZoneInDubai = LocalDateTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println("Time in Dubai right now: " + timeZoneInDubai + "\n");

        // Checking time zone for Asia/Kolkata

        LocalDateTime timeZoneInKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in Kolkata right now: " + timeZoneInKolkata + "\n");

        // Checking time zone for America/New_York

        LocalDateTime timeZoneInNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in New York right now: " + timeZoneInNewYork + "\n");

        // Checking time zone for America/Cancun

        LocalDateTime timeZoneInCancun = LocalDateTime.now(ZoneId.of("America/Cancun"));
        System.out.println("Time in cancun right now: " + timeZoneInCancun + "\n");

        LocalDateTime timeInPennsylvania = LocalDateTime.now();
        System.out.println("Time in Pennsylvania: " + timeInPennsylvania + "\n");

        // Checking time zone for Australia/Melbourne

        LocalDateTime timeZoneInMelbourne = LocalDateTime.now(ZoneId.of("Australia/Melbourne"));
        System.out.println("Time in Melbourne: " + timeZoneInMelbourne + "\n");

    }
}
