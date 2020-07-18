package com.translate.wordapp.controller;

import com.translate.wordapp.model.WordModel;
import com.translate.wordapp.service.WordService;
import com.translate.wordapp.validation.annotation.WordValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * created by Abdulaziz Erel on 21:24 13.06.2020
 **/
@RestController
@ControllerAdvice
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/findWord")
    public WordModel findWord(@WordValid @Valid @RequestParam(value = "engWord") String engWord) {
        return wordService.findWord(engWord);
    }

    @GetMapping("/page")
    public List<WordModel> page(@WordValid @Valid @RequestParam(value = "number") int number) {
        return wordService.getPage(number);
    }

}
