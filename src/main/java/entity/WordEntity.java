package entity;

import com.sun.istack.NotNull;
import constant.WordModelConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 * created by Abdulaziz Erel on 22:35 09.06.2020
 **/
@Entity
@Table(name = WordModelConstant.TABLE_NAME)
public class WordEntity extends BaseEntity {

    @NotNull
    @Column(name = "ENGLISH_WORD")
    @Size(max = WordModelConstant.ENG_WORD_MAX, min = WordModelConstant.ENG_WORD_MIN)
    private String englishWord;

    @NotNull
    @Column(name = "TURKISH_WORD")
    @Size(max = WordModelConstant.TR_WORD_MAX, min = WordModelConstant.TR_WORD_MIN)
    private String turkishWord;

    @Column(name = "PRONUNCIATION")
    @Size(max = WordModelConstant.PRON_WORD_MAX, min = WordModelConstant.PRON_WORD_MIN)
    private String pronunciation;

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
