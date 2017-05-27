package com.example.sangh.midasparactice.Model;

/**
 * Created by sangh on 2017-05-27.
 */

public class Volunteer {
    private int num;
    private  String title;
    private  int point;
    private int totalPoint;
    private String contents;

    Volunteer(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
