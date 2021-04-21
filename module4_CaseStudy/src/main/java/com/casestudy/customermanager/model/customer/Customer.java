package com.casestudy.customermanager.model.customer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor
public class Customer {


    @Id
    private String customertypeId;

    private String customerName;
    private String customerDob;
    private String customerIdCard;
    private String customerNumberPhone;
    private String customerEmail;
    private String customerAddress;
    

    public Customer(String customertypeId, String customerName, String customerDob, String customerIdCard, String customerNumberPhone, String customerEmail, String customerAddress) {
        this.customertypeId = customertypeId;
        this.customerName = customerName;
        this.customerDob = customerDob;
        this.customerIdCard = customerIdCard;
        this.customerNumberPhone = customerNumberPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
}
