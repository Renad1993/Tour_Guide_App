package com.example.android.tourguideapp;

public class UmQies {
    //declare the member variable
    private String mNameOfPlace;
    private String mWorkTime;
    private int mImageResourceId;

    //constructor for UmQies class that accept three argument
    public UmQies(String nameOfPlace, String workTime, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mWorkTime = workTime;
        mImageResourceId = imageResourceId;
    }

    //get the name of place method
    public String getmNameOfPlace() {
        return mNameOfPlace;
    }

    //get the work time method
    public String getmWorkTime() {
        return mWorkTime;
    }

    //get the image resource ID method
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
