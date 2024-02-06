package com.syntexpro.bytecraft11.stringstaticmethod;

/*
    format();
    -> It is used to create formatted strings with placeholders replaced by the specified values;
    -> The format specifiers ('%s - string', '%d - integer', '%f - double', '%tA - weekday', '%te - date of the month', '%tB - month name', '%tY - year' etc.) dictate how the values should be formatted;
 */

import java.util.Date;

public class FormatStaticMethod {
    public static void main(String[] args) {

        //formatting string

        String str1 = String.format("Congratulations %s! You have reached %dK subscribers on your youtube channel", "Zendria", 100);
        System.out.println(str1);

        //formatting numbers

        String intNumber = String.format("%d is my favorite number", 108);
        System.out.println(intNumber);

        String doubleNumber = String.format("My CGPA right now is %.2f out of %.2f", 3.78, 4.00);  // .2 between %f is used to limit the decimal up to wo digits;
        System.out.println(doubleNumber);

        doubleNumber = String.format("My percentage for %s, %s and %s are: %f, %.2f, %f", "IST7040", "IST7060", "SEC6010", 93.95, 92.15, 95.00);
        System.out.println(doubleNumber + "\n");

        //formatting date

        Date presentDate = new Date();

        String formatDate = String.format("Today is %tA", presentDate);
        System.out.println(formatDate);

        formatDate = String.format("Today's date is %te", presentDate);
        System.out.println(formatDate);

        formatDate = String.format("Month is %tB", presentDate);
        System.out.println(formatDate);

        formatDate = String.format("Year is %tY", presentDate);
        System.out.println(formatDate);

        formatDate = String.format("Today is %tA %te %tB, %tY", presentDate, presentDate, presentDate, presentDate);
        System.out.println(formatDate + "\n");

        //Specifying Argument Index

        String formatIndex = String.format("%2$s %1$s", "Floyd", "Pink");
        System.out.println(formatIndex);
        /*
            -> '%2$s' specifier indicates that the second argument ('Pink') should be inserted at this position in the formatted string;
            -> '$s' indicates that it's a string;
            -> '%1$s' specifier indicates that the first argument ('Floyd') should be inserted at this position in the formatted string;
         */

        formatIndex = String.format("%5$s %2$s %7$s %3$s %4$s %6$s %1$s", "Red", "Indigo", "Green", "Yellow", "Violet", "Orange", "Blue");
        System.out.println(formatIndex);


    }

}
