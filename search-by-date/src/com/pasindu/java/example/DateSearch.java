package com.pasindu.java.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DateSearch {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, LocalDate.now()));
        invoices.add(new Invoice(2, LocalDate.now().plusDays(1)));
        invoices.add(new Invoice(3, LocalDate.now().plusDays(2)));
        invoices.add(new Invoice(4, LocalDate.now().plusDays(3)));

        invoices.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        invoices.stream()
                .filter(i -> i.getDate().equals(LocalDate.parse("2019-06-06")))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
