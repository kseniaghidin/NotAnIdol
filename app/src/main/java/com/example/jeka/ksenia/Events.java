package com.example.jeka.ksenia;

public class Events {
    private String month;
    private String date;
    private String event_name;
    private String time;
    private String link;

    public Events(String month, String date, String event_name, String time, String link) {
        this.month = month;
        this.date = date;
        this.event_name = event_name;
        this.time = time;
        this.link = link;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
