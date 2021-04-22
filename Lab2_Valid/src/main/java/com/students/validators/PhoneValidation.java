package com.students.validators;

import com.students.domain.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidation implements ConstraintValidator<USPhone, Phone> {

    @Override
    public void initialize(USPhone constraintAnnotation) {
        System.out.println("Here initialize");
    }

    @Override
    public boolean isValid(Phone value, ConstraintValidatorContext context) {
        System.out.println("Here isValid");

        try {
            if (value.getArea() < 100 || 999 < value.getArea()) return false;
            if (value.getPrefix() < 100 || 999 < value.getPrefix()) return false;
            if (value.getNumber() < 1000 || 9999 < value.getNumber()) return false;

            return true;
        }
        catch (Exception exception){
            System.out.println(exception);
            return false;
        }
    }
}
