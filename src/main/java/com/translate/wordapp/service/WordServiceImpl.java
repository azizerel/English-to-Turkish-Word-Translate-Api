package com.translate.wordapp.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.translate.wordapp.converter.WordConverter;
import com.translate.wordapp.entity.WordEntity;
import com.translate.wordapp.model.WordModel;
import com.translate.wordapp.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * created by Abdulaziz Erel on 21:44 13.06.2020
 **/
@Service
@Transactional
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository wordRepository;


    @Override
    @Transactional(readOnly = true)
    public WordModel findWord(String word) {
        WordEntity entity = wordRepository.findOne(Example.of(new WordEntity(word))).orElse(null);
        return WordConverter.convertDto(entity, WordModel.class);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WordModel> getPage(int number) {
        Pageable pageable = PageRequest.of(number, 10, Sort.by("englishWord"));
        Page<WordEntity> page = wordRepository.findAll(pageable);

        return WordConverter.convertList(page.getContent(), new TypeReference<List<WordModel>>() {
        });
    }


}
