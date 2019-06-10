package com.pasindu.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamples {
    public static void main(String[] args) {
        try {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(new Date().toInstant().toString()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new Date());
    }
}
