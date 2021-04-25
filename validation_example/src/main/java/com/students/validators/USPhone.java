package com.students.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidation.class)
public @interface USPhone {

    String message() default "{com.students.validators.USPhone.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
