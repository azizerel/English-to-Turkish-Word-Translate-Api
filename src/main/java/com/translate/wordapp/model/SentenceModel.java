package com.translate.wordapp.model;

import javax.validation.constraints.NotNull;

/**
 * created by Abdulaziz Erel on 20:05 20.06.2020
 **/
public class SentenceModel extends BaseModel {

    @NotNull
    private WordModel word;

    @NotNull
    private String sentence;

    public WordModel getWord() {
        return word;
    }

    public void setWord(WordModel word) {
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
