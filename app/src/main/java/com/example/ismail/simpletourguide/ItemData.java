package com.example.ismail.simpletourguide;

/**
 * Created by ismail on 20/01/18.
 */

public class ItemData {
    private String mTitleName;
    private String mLocation;
    private int mImageResourceId;

    public ItemData(String mTitleName, String mLocation, int mImageResourceId) {
        this.mTitleName = mTitleName;
        this.mLocation = mLocation;
        this.mImageResourceId = mImageResourceId;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmTitleName() {
        return mTitleName;
    }

    public String getmLocation() {
        return mLocation;
    }
}
