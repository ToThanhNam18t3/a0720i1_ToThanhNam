package com.casestudy.customermanager.model.customer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor
public class CustomerType {

    @Id
    private String customerTypeId;

    private String customerTypeName;

    public CustomerType(String customerTypeId, String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }
}
