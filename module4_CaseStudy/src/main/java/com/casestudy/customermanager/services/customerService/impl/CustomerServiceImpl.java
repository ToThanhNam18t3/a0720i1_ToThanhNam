package com.casestudy.customermanager.services.customerService.impl;

import com.casestudy.customermanager.model.customer.Customer;
import com.casestudy.customermanager.model.customer.CustomerType;
import com.casestudy.customermanager.repositories.CustomerRepository;
import com.casestudy.customermanager.repositories.CustomerTypeRepository;
import com.casestudy.customermanager.services.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(String id) {
        Customer customer = customerRepository.findByCustomerId(id);
        customerRepository.delete(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Page<Customer> findCustomerByCustomerName(Pageable pageable, String name) {
        if(name.equals("") || name.isEmpty()){
            return customerRepository.findAll(pageable);
        } else {
            return customerRepository.findCustomerByCustomerName(pageable, name);
        }
    }
}
