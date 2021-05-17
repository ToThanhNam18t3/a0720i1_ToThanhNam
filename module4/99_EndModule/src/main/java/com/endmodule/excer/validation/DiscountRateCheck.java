package com.endmodule.excer.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DiscountRateCheckValidator.class)
@Documented
public @interface DiscountRateCheck {
    String message() default "abcd";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
