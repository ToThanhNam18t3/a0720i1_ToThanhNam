package com.casestudy.customermanager.repositories.employeeRepositories;

import com.casestudy.customermanager.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
}
