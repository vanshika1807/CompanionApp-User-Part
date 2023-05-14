package com.example.companionapp.ui.notice;

public class NoticeData {
    String title, image, data, time, key,date;

    public NoticeData(){

    }

    public NoticeData(String title, String image, String data, String time, String key,String date) {
        this.title = title;
        this.image = image;
        this.data = data;
        this.time = time;
        this.key = key;
        this.date=date;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
