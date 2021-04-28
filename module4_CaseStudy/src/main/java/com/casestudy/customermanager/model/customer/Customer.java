package com.casestudy.customermanager.model.customer;


import com.casestudy.customermanager.validation.customerValidation.CustomerIdCheck;
import com.casestudy.customermanager.validation.customerValidation.IdCardCheck;
import com.casestudy.customermanager.validation.customerValidation.NumberphoneCheck;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {

    @Id
    @CustomerIdCheck(message = "")
    private String customerId;

    private String customerName;
    private String customerDob;

    @IdCardCheck
    private String customerIdCard;

    @NumberphoneCheck(message ="")
    private String customerNumberPhone;
    private String customerEmail;
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name="customerTypeId" , nullable = false)
    private CustomerType customerType;

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Customer customer = (Customer) target;
//
//        String customerId = customer.getCustomerName();
//        ValidationUtils.rejectIfEmpty(errors, "customerId" , "customerId.empty");
//        if(!customerId.matches("^KH-[0-9]{4}$")){
//            errors.rejectValue("customerId","customerId.length");
//        }
//    }
}
