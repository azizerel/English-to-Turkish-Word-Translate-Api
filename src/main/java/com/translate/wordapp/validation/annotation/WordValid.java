package com.translate.wordapp.validation.annotation;

import com.translate.wordapp.validation.WordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * created by Abdulaziz Erel on 01:31 21.06.2020
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
@Constraint(validatedBy = WordValidator.class)
@Documented
public @interface WordValid {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload> [] payload() default {};

}
