package com.casestudy.customermanager.validation.customerValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerCheckValidator implements ConstraintValidator<CustomerIdCheck, String> {

    public boolean isValid(String obj, ConstraintValidatorContext context) {

       context.disableDefaultConstraintViolation();

       if (obj.equals("")) {
          context.buildConstraintViolationWithTemplate("Tên không được để trống").addConstraintViolation();
          return false;
       }
       if (!obj.matches("^KH-[\\d]{4}$")) {
          context.buildConstraintViolationWithTemplate("Sai định dạng ( KH-XXXX )").addConstraintViolation();
          return false;
       }
        return true;
    }
}
