package com.translate.wordapp.constant;

/**
 * created by Abdulaziz Erel on 22:53 09.06.2020
 **/
public final class WordModelConstant {

    public static final String TABLE_NAME = "WORD";

    public static final int ENG_WORD_MAX = 40;
    public static final int ENG_WORD_MIN = 1;

    public static final int TR_WORD_MAX = 100;
    public static final int TR_WORD_MIN = 1;

    public static final int PRON_WORD_MAX = 100;
    public static final int PRON_WORD_MIN = 1;

    private WordModelConstant() {
        //can not create instance
    }
}
