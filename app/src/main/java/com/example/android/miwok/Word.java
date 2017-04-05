package com.example.android.miwok;

/**
 * Created by mariana on 4/5/2017.
 */

public class Word {

    /**
     * Default Translation of the word:
     */
    private String mDefaultTranslation;

    /**
     * Miwok Translation of the word:
     */
    private String mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
