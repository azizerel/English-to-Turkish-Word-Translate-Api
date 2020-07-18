package com.translate.wordapp.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.translate.wordapp.constant.SentenceModelConstant;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * created by Abdulaziz Erel on 20:05 20.06.2020
 **/

@Entity
@Table(name = SentenceModelConstant.TABLE_NAME)
public class SentenceEntity extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "WORD_ID")
    @JsonBackReference
    private WordEntity word;

    @NotNull
    @Column(name = "SENTENCE")
    @Size(min = SentenceModelConstant.SENTENCE_MIN, max = SentenceModelConstant.SENTENCE_MAX)
    private String sentence;

    public WordEntity getWord() {
        return word;
    }

    public void setWord(WordEntity word) {
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
