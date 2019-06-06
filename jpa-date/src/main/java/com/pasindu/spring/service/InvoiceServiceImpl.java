package com.pasindu.spring.service;

import com.pasindu.spring.model.Invoice;
import com.pasindu.spring.model.InvoiceSearch;
import com.pasindu.spring.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements  InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> fetchAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public List<Invoice> fetchBySearch(InvoiceSearch invoiceSearch) {
        return invoiceRepository.findByBillDate(invoiceSearch.getBillDate());
    }
}
