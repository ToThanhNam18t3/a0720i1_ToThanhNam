package com.validate.validatephonenumber.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Component
public class PhoneNumber implements Validator {

    @Id
    private String phoneNumber;

    public PhoneNumber() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return PhoneNumber.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumber phoneNumber = (PhoneNumber) target;
        String phonenumber = phoneNumber.getPhoneNumber();

        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phonenumber.empty");

        if (phonenumber.length() > 11 || phonenumber.length() < 10) {
            errors.rejectValue("phoneNumber", "phonenumber.length");
        }
        if (!phonenumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phonenumber.startsWith");
        }
        if (!phonenumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phonenumber.matches");
        }
    }
}
