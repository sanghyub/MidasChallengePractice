package com.example.sangh.midasparactice.Model;

import java.util.Date;

/**
 * Created by sangh on 2017-05-23.
 */

public class MemoItem {
    int mNum;
    int mImg;
    String mName;
    Boolean isImg;
    String mImagePath;
    String mContents;
    Date mDate;

    public MemoItem(){
        mName="제목없음";
        mDate = new Date();
    }

    public int getNum() {
        return mNum;
    }

    public void setNum(int num) {
        mNum = num;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getImg() {
        return isImg;
    }

    public void setImg(Boolean img) {
        isImg = img;
    }

    public String getImagePath() {
        return mImagePath;
    }

    public void setImagePath(String imagePath) {
        mImagePath = imagePath;
    }

    public String getContents() {
        return mContents;
    }

    public void setContents(String contents) {
        mContents = contents;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
