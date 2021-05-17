package com.casestudy.customermanager.services.customerService;

import com.casestudy.customermanager.model.customer.Customer;
import com.casestudy.customermanager.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(String id);
    Customer findById(int id);
    Customer findByCustomerId(String id);

    List<CustomerType> findAllCustomerType();
    Page<Customer> findCustomerByCustomerName(Pageable pageable , String name);

}
