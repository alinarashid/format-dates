package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;

/**
 * Format Dates
 * Gets the current date and time and displays it in several formats
 * using DateTimeFormatter patterns.
 */
public class FormatDate {
    public static void main(String[] args) {

        // Get the current date and time once and reuse it for every format
        LocalDateTime date = LocalDateTime.now();

        // Format 1: MM/dd/yyyy (e.g. 10/28/2026)
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(fmt));

        // Format 2: yyyy-MM-dd (e.g. 2026-10-28)
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(fmt2));

        // Format 3: full weekday and month name (e.g. Wednesday, October 28, 2026)
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        System.out.println(date.format(fmt3));

        // Format 4: weekday, short month, date and 24-hour time (e.g. Wednesday, Oct 28, 2026 20:09 in GMT)
        // Show this one in GMT time
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        System.out.println(gmtNow.format(fmt4));
    }
}