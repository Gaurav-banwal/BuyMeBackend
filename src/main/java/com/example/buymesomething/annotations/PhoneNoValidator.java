package com.example.buymesomething.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNoValidator implements ConstraintValidator<PhoneNoValidation,String> {
    @Override
    public void initialize(PhoneNoValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        boolean isOnlyDigits = value.matches("\\d+");
        return  isOnlyDigits;
    }
}
