package com.pasindu.spring.service;

import com.pasindu.spring.model.Invoice;
import com.pasindu.spring.model.InvoiceSearch;

import java.util.List;

public interface InvoiceService {
    Invoice save(Invoice invoice);

    List<Invoice> fetchAll();

    List<Invoice> fetchBySearch(InvoiceSearch invoiceSearch);
}
