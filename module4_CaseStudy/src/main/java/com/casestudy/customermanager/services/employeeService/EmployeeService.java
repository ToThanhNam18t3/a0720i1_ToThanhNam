package com.casestudy.customermanager.services.employeeService;

import com.casestudy.customermanager.model.employee.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService  {

    Page<Employee> findAll();
    void delete(String id);
    Employee edit(Employee employee , String id);

}
