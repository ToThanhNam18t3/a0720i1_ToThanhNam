package com.endmodule.excer.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DiscountRateCheckValidator implements ConstraintValidator<DiscountRateCheck, String> {

    public boolean isValid(String obj, ConstraintValidatorContext context) {

        context.disableDefaultConstraintViolation();
        int discount = 0;
        if (obj.equals("")) {
            context.buildConstraintViolationWithTemplate("không được để trống").addConstraintViolation();
            return false;
        } else {
            try {
                discount = Integer.parseInt(obj);
            } catch (Exception e) {
                context.buildConstraintViolationWithTemplate("Phaỉ nhập số").addConstraintViolation();
                return false;
            }
            if (discount < 10000){
                context.buildConstraintViolationWithTemplate("Phai lon hon 10000").addConstraintViolation();
                return false;
            }
        }
        return true;
    }

}
