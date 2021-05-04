package com.example.android.newsapp;

public class News {

    private String mTag;
    private String mHeadline;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public News(String tag, String headline, String date, String url, String author) {
        mTag = tag;
        mHeadline = headline;
        mDate = date;
        mUrl = url;
        mAuthor = author;
    }

    public News(String tag, String headline, String date, String url) {
        mTag = tag;
        mHeadline = headline;
        mDate = date;
        mUrl = url;
    }


    public String getTag() {
        return mTag;
    }

    public String getHeadline() {
        return mHeadline;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }
}

