package com.pasindu.spring.controller;

import com.pasindu.spring.model.Invoice;
import com.pasindu.spring.model.InvoiceSearch;
import com.pasindu.spring.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/emscloud")
public class InvoiceController {
    @Autowired
    InvoiceRepository invoiceRepository;

    @PostMapping("/invoice")
    public Invoice create(@RequestBody Invoice invoice){
        return  invoiceRepository.save(invoice);
    }

    @GetMapping("/invoices")
    public List<Invoice> fetchAll(){
        return invoiceRepository.findAll();
    }

    @GetMapping("/invoice/{date}")
    public List<Invoice> fetchByDate(@PathVariable Date date){
        return invoiceRepository.findByBillDate(date);
    }

    @GetMapping("/invoice/search")
    public List<Invoice> fetchByDateExample(@RequestBody InvoiceSearch invoiceSearch){
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("2019-06-06");
        } catch (ParseException e) {
            date = new Date();
            System.out.println(date+": today");
        }
        return invoiceRepository.findByBillDate(date);
    }
}
