package com.vu.week3;

import android.graphics.Bitmap;

public class DocClass {
    private int image;
    private int likes;
    private String name;

    public DocClass(int image, int likes, String name) {
        this.image = image;
        this.likes = likes;
        this.name = name;
    }

    public DocClass() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
