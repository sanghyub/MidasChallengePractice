package com.example.sangh.midasparactice.Model;

import android.graphics.Bitmap;

/**
 * Created by sangh on 2017-05-27.
 */

public class UserInfo {
    private int num;
    private String name;
    private int point;
    private Bitmap userImage;

    UserInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Bitmap getUserImage() {
        return userImage;
    }

    public void setUserImage(Bitmap userImage) {
        this.userImage = userImage;
    }
}
