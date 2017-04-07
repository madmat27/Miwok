package com.example.android.miwok;

/**
 * Created by mariana on 4/5/2017.
 */

public class Word {

    /**
     * Constant use to represent that there was no image provided:
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default Translation of the word:
     */
    private String mDefaultTranslation;
    /**
     * Miwok Translation of the word:
     */
    private String mMiwokTranslation;
    /**
     * ImageId used for the word:
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Main Ctor with 2 parameters
     *
     * @param DefaultTranslation Provides the Default Word
     * @param MiwokTranslation   Provides the Miwok Translation
     */
    public Word(String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    /**
     * Secondary Ctor with 3 parameters
     *
     * @param DefaultTranslation Provides the Default Word
     * @param MiwokTranslation   Provides the Miwok Translation
     * @param ImageResourceId    Provides the relevant Image where applicable
     */
    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
    }


    /**
     * Default Translation Getter
     *
     * @return the word of the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Miwok Translation Getter
     *
     * @return the word of the Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Image Resource Getter
     *
     * @return the ID of the ImageResource used
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Check if there is an actual ImageResource
     *
     * @return true, if there is / false, if there isn't
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
