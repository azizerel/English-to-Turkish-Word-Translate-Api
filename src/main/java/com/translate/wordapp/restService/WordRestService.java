package com.translate.wordapp.restService;

import com.translate.wordapp.model.WordModel;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotBlank;

/**
 * created by Abdulaziz Erel on 19:43 20.06.2020
 **/

@Validated
public interface WordRestService {


    @RequestMapping(method = RequestMethod.GET, path = "/getir/{engWord}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    WordModel findWord(@NotBlank @PathVariable("engWord") String engWord);
}
