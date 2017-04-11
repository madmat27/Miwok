package com.example.android.miwok;

/**
 * Created by Mariana S.Mz on 4/5/2017.
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
     * Audio Resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Main Ctor with 2 parameters
     *
     * @param defaultTranslation Provides the Default Word
     * @param miwokTranslation   Provides the Miwok Translation
     * @param audioResourceId    Provides the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Secondary Ctor with 3 parameters
     *
     * @param defaultTranslation Provides the Default Word
     * @param miwokTranslation   Provides the Miwok Translation
     * @param imageResourceId    Provides the relevant Image where applicable
     * @param audioResourceId    Provides the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     * Audio Resource Getter
     *
     * @return the ID of the AudioResource used
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * For Debugging purposes!!! Excellent tool!
     *
     * @return A string with all class components
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
