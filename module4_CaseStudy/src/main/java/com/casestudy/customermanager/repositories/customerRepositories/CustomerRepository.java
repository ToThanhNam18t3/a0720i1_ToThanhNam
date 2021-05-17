package com.casestudy.customermanager.repositories.customerRepositories;

import com.casestudy.customermanager.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Page<Customer> findAll(Pageable pageable);

    @Query("select s from Customer s where "
            +"concat(s.customerName, '')"
            +"like %?1%"
    )
    Page<Customer> findCustomerByCustomerName(Pageable pageable, String name);

    Customer findByCustomerId(String id);
}
