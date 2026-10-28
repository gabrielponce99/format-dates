package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatesApp {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        // Format MM/dd/yyyy
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);

        // Format yyyy-MM-dd
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);

        // Format Day, Month Date, Year
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);

        // Format Day, Month Date, Year time
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm a");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);

        // Format GMT Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy", Locale.ENGLISH);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now.format(formatter));

        System.out.println("Zone: " + ZoneId.systemDefault());
    }
}
