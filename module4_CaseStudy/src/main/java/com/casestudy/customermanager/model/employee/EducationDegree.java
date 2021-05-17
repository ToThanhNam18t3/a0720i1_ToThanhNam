package com.casestudy.customermanager.model.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EducationDegree {

    @Id
    private String educationDgreeId;

    @OneToMany
    private Set<Employee> educationDegreeName;

    public EducationDegree(String educationDgreeId, Set<Employee> educationDegreeName) {
        this.educationDgreeId = educationDgreeId;
        this.educationDegreeName = educationDegreeName;
    }
}

