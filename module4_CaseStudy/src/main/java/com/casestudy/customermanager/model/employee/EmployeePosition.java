package com.casestudy.customermanager.model.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @Getter @Setter
public class EmployeePosition {

    @Id
    private String employeePositionId;

    private String employeePositionName;

    public EmployeePosition(String employeePositionId, String employeePositionName) {
        this.employeePositionId = employeePositionId;
        this.employeePositionName = employeePositionName;
    }
}
