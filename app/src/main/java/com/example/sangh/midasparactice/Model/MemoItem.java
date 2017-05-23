package com.example.sangh.midasparactice.Model;

import android.util.Log;
import android.widget.FrameLayout;

import java.util.Date;

/**
 * Created by sangh on 2017-05-23.
 */

public class MemoItem {

    private int mNum;
    private int mImg;
    private String mName;
    private String mImagePath;
    private String mContents;
    private Date mDate;

    public MemoItem(){
        // Default ....
        build();
    }

    public MemoItem(int mNum,  String mName, String mContents, int mImg, String imagePath ){
        this();
        this.mNum = mNum;
        this.mImg=mImg;
        this.mName=mName;
        this.mImagePath=imagePath;
        this.mContents=mContents;
    }

    public MemoItem(int mNum, String mName, String mContents){
        this();
        this.mNum = mNum;
        this.mName=mName;
        this.mContents=mContents;
    }

    public void build(){
        mDate=new Date();
        this.mName="제목없음";
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

    public void setImg(int img) {
        mImg = img;
    }
    public int getImg() {
        return mImg;
    }

}
