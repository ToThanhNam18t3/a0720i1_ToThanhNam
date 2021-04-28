package com.casestudy.customermanager.validation.customerValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdCardCheckValidator implements ConstraintValidator<IdCardCheck, String> {

   public boolean isValid(String obj, ConstraintValidatorContext context) {

      context.disableDefaultConstraintViolation();
      if(obj.equals("")){
         context.buildConstraintViolationWithTemplate("Can't be null").addConstraintViolation();
         return false;
      }
      if (!obj.matches("^([\\d]{9}|[\\d]{12})$")){
         context.buildConstraintViolationWithTemplate("ID Card 9 | 12 number").addConstraintViolation();
         return false;
      }
      return true;
   }
}
