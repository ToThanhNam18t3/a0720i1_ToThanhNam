package com.casestudy.customermanager.repositories.employeeRepositories;

import com.casestudy.customermanager.model.employee.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePositionRepository extends JpaRepository<EmployeePosition , Integer> {
}
