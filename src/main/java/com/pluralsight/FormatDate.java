package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //MM/dd/yyyy
        System.out.println(date.format(fmt));
        //yyyy-MM-dd
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date .format(fmt2));
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        System.out.println(date.format(fmt3));

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        System.out.println(date.format(fmt4));


    }
}
