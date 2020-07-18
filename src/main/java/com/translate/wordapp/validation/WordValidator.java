package com.translate.wordapp.validation;

import com.translate.wordapp.validation.annotation.WordValid;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * created by Abdulaziz Erel on 01:36 21.06.2020
 **/
@Component
public class WordValidator  implements ConstraintValidator<WordValid,String> {

    @Override
    public void initialize(WordValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
