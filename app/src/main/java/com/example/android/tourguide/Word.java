package com.example.android.tourguide;

/**
 * Created by Rushi Patel on 7/24/2016.
 */
public class Word
{
    //NYC Attraction
    private String mAttraction;

    //NYC location
    private String mLocation;

    //Image Resource Id
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String attraction, String location)
    {
        mAttraction = attraction;
        mLocation = location;
    }

    public Word(String attraction, String location, int imageResourceId)
    {
        mAttraction = attraction;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getAttraction()
    {
        return mAttraction;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImageId()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
