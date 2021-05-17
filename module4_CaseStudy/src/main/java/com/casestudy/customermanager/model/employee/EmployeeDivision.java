package com.casestudy.customermanager.model.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDivision {

    @Id
    private String employeeDivision;

    private String employeeDivisionName;

    public EmployeeDivision(String employeeDivision, String employeeDivisionName) {
        this.employeeDivision = employeeDivision;
        this.employeeDivisionName = employeeDivisionName;
    }
}
