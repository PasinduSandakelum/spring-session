package com.pasindu.spring.repository;

import com.pasindu.spring.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
    List<Invoice> findByBillDate(Date date);
}
