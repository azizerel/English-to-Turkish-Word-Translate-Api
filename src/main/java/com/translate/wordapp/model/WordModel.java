package com.translate.wordapp.model;

import com.translate.wordapp.constant.WordModelConstant;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * created by Abdulaziz Erel on 23:36 09.06.2020
 **/
@Validated
public class WordModel extends BaseModel{

    @NotNull
    @Size(max = WordModelConstant.ENG_WORD_MAX, min = WordModelConstant.ENG_WORD_MIN)
    private String englishWord;

    @NotNull
    @Size(max = WordModelConstant.TR_WORD_MAX, min = WordModelConstant.TR_WORD_MIN)
    private String turkishWord;

    @Size(max = WordModelConstant.PRON_WORD_MAX, min = WordModelConstant.PRON_WORD_MIN)
    private String pronunciation;

    private Set<SentenceModel> sentenceList;

    public Set<SentenceModel> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(Set<SentenceModel> sentenceList) {
        this.sentenceList = sentenceList;
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
