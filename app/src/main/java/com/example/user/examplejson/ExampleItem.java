package com.example.user.examplejson;

public class ExampleItem {
    private  String mImageUrl;
    private String mCreator;
    private int mLike;

    public ExampleItem(String ImageUrl,String creator,int likes)
    {
        mImageUrl = ImageUrl;
        mCreator = creator;
        mLike = likes;
    }
    public String getImageUrl()
    {
        return mImageUrl;
    }
    public String getmCreator()
    {
        return mCreator;
    }
    public int getLikeCount()
    {
        return mLike;
    }
}
