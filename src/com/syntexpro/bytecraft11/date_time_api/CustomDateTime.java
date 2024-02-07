package com.syntexpro.bytecraft11.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomDateTime {
    public static void main(String[] args) {

        LocalDateTime customDateTime = LocalDateTime.of(2024, 10, 12, 12, 40, 55);
        System.out.println(customDateTime);

        LocalDateTime myBirthDate = LocalDateTime.of(1997, 01, 02, 06, 18, 18, 10818);
        System.out.println(myBirthDate);
    }
}
