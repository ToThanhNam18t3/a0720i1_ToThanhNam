package com.casestudy.customermanager.model.employee;

import lombok.Data;
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
@Data
public class Employee {

    @Id
    private String employeeId;

    private String employeeName;
    private String employeeDob;
    private String employeeIdCard;
    private String employeeNumberPhone;
    private String employeeEmail;

    @ManyToOne
    private EducationDegree employeeEducationDegreeId;

    @ManyToOne
    private EmployeePosition employeePositionId;
    private long employeeSalary;


    public Employee(String employeeId, String employeeName, String employeeDob, String employeeIdCard, String employeeNumberPhone, String employeeEmail, EducationDegree employeeEducationDegreeId, EmployeePosition employeePositionId, long employeeSalary) {
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
