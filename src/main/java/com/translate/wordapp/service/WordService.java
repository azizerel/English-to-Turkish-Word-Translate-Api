package com.translate.wordapp.service;

import com.translate.wordapp.model.WordModel;
import com.translate.wordapp.validation.annotation.WordValid;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;

/**
 * created by Abdulaziz Erel on 21:44 13.06.2020
 **/

@Validated
public interface WordService {

    WordModel findWord(@WordValid @NotBlank String word);

    List<WordModel> getPage(@Positive int number);
}
