package com.store.healthsnap;

public class Firebase_Database {


    private String title;
    private String date;
    private String time;
    private String description;

    public Firebase_Database() {
    }

    public Firebase_Database(String title, String date, String time, String description) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
