package com.casestudy.customermanager.model.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@NoArgsConstructor @Getter @Setter
public class EmployeePosition {

    @Id
    private String employeePositionId;

    @OneToMany
    private Set<Employee> employeePositionName;

    public EmployeePosition(String employeePositionId, Set<Employee> employeePositionName) {
        this.employeePositionId = employeePositionId;
        this.employeePositionName = employeePositionName;
    }
}
