package com.casestudy.customermanager.validation.customerValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdCardCheckValidator.class)
@Documented

public @interface IdCardCheck {
    String message() default "ID CARD";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
