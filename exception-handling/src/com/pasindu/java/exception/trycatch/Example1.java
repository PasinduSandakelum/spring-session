package com.pasindu.java.exception.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {
//        String str = null;
//        BufferedReader reader = null;
//        System.out.println("Enter Your Name :");
//        reader = new BufferedReader(new InputStreamReader(System.in));
//
//        str = reader.readLine();
//
//        System.out.println("You have entered : " + str);
//
        String str = null;
        int number = 1;
        System.out.println("Enter any number :");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

//            str = reader.readLine();
            number = Integer.parseInt(reader.readLine());
            System.out.println("You have entered : " + number);
        }

    }
}
