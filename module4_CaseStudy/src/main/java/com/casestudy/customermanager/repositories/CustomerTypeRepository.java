package com.casestudy.customermanager.repositories;

import com.casestudy.customermanager.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType , Integer> {

}
