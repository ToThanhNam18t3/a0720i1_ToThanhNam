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
public class EducationDegree {

    @Id
    private String educationDgreeId;

    private String educationDegreeName;

    public EducationDegree(String educationDgreeId, String educationDegreeName) {
        this.educationDgreeId = educationDgreeId;
        this.educationDegreeName = educationDegreeName;
    }
}

