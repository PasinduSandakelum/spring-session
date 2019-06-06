package com.pasindu.java.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invoice {
    Integer id;
    LocalDate date;

    public Invoice(Integer id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
