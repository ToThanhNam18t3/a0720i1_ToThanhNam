package com.webservice.managecus.services;

import com.webservice.managecus.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> showAll();
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);
}
