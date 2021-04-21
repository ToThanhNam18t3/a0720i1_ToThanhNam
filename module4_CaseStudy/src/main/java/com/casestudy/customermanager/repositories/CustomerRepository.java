package com.casestudy.customermanager.repositories;

import com.casestudy.customermanager.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
