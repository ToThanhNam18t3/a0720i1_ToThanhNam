package com.casestudy.customermanager.validation.customerValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberphoneCheckValidator implements ConstraintValidator<NumberphoneCheck, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        if (value.equals("")) {
            context.buildConstraintViolationWithTemplate("Name must input something").addConstraintViolation();
            return false;
        }
        if (!value.matches("^(84|0[3|5|7|8|9])+([0-9]{8})\\b$")) {
            context.buildConstraintViolationWithTemplate("Sai định dạng" +
                    "090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx").addConstraintViolation();
            return false;
        }
        return true;
    }
}