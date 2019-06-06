package com.pasindu.java.example;

import java.time.ZonedDateTime;

public class InvoiceZonedDate {
    Integer id;
    ZonedDateTime date;

    public InvoiceZonedDate(Integer id, ZonedDateTime date) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
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
