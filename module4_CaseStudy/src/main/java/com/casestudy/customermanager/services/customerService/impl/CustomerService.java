package com.casestudy.customermanager.services.customerService.impl;

import com.casestudy.customermanager.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);

}
