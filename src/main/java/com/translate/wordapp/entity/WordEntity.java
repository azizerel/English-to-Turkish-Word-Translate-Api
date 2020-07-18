package com.translate.wordapp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import com.translate.wordapp.constant.WordModelConstant;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;


/**
 * created by Abdulaziz Erel on 22:35 09.06.2020
 **/
@Entity
@Table(name = WordModelConstant.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(name = "idx_col_engWord", columnNames = {"ENGLISH_WORD"})
})
public class WordEntity extends BaseEntity {

    @NotNull
    @Column(name = "ENGLISH_WORD")
    @Size(max = WordModelConstant.ENG_WORD_MAX, min = WordModelConstant.ENG_WORD_MIN)
    protected String englishWord;

    @NotNull
    @Column(name = "TURKISH_WORD")
    @Size(max = WordModelConstant.TR_WORD_MAX, min = WordModelConstant.TR_WORD_MIN)
    private String turkishWord;

    @Column(name = "PRONUNCIATION")
    @Size(max = WordModelConstant.PRON_WORD_MAX, min = WordModelConstant.PRON_WORD_MIN)
    private String pronunciation;

    @OneToMany(mappedBy = "word",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference(value = "word")
    private Set<SentenceEntity> sentenceList;

    private WordEntity() {
    }



    public Set<SentenceEntity> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(Set<SentenceEntity> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public WordEntity(String word) {
        this.englishWord = word;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getTurkishWord() {
        return turkishWord;
    }

    public void setTurkishWord(String turkishWord) {
        this.turkishWord = turkishWord;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }
}
