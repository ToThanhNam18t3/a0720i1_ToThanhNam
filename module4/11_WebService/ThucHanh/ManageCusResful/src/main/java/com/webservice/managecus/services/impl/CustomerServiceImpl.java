package com.webservice.managecus.services.impl;

import com.webservice.managecus.model.Customer;
import com.webservice.managecus.repositories.CustomerRepository;
import com.webservice.managecus.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> showAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(int id) {
         customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
