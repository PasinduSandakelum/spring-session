package com.pasindu.java.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.now();

        Date date = new Date();

//        System.out.println(formatter.format(dateTime));

//        Date newDate = (Date) formatter.parse("06/06/2019 12:30");
//        System.out.println(newDate);

        String dateString = format.format( new Date()   );
        Date   date1       = format.parse ( "2009-12-31" );

        System.out.println(dateString);
        System.out.println(date1);
//        System.out.println(formatter.format());
    }
}
