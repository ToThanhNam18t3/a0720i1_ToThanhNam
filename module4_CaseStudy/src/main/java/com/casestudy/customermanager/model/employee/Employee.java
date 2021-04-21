package com.casestudy.customermanager.model.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id
    private String employeeId;

    private String employeeName;
    private String employeeDob;
    private String employeeIdCard;
    private String employeeNumberPhone;
    private String employeeEmail;
    private String employeeEducationDegreeId;
    private String employeePositionId;
    private long employeeSalary;


    public Employee(String employeeId, String employeeName, String employeeDob, String employeeIdCard, String employeeNumberPhone, String employeeEmail, String employeeEducationDegreeId, String employeePositionId, long employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDob = employeeDob;
        this.employeeIdCard = employeeIdCard;
        this.employeeNumberPhone = employeeNumberPhone;
        this.employeeEmail = employeeEmail;
        this.employeeEducationDegreeId = employeeEducationDegreeId;
        this.employeePositionId = employeePositionId;
        this.employeeSalary = employeeSalary;
    }
}
