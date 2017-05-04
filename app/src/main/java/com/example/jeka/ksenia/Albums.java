package com.example.jeka.ksenia;

public class Albums {
    private int image_id;
    private String title;
    private String detail;
    private String link;

    public Albums(int image_id, String title, String detail, String link) {
        this.image_id = image_id;
        this.title = title;
        this.detail = detail;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}