package com.example.buymesomething.annotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(
        validatedBy = {PhoneNoValidator.class}
)
public @interface PhoneNoValidation {

    String message() default "Role of employee can be admin or user ";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
