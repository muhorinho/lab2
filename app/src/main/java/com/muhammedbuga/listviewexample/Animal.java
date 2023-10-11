package com.muhammedbuga.listviewexample;

public class Animal {
    private String name;
    private int imageResId;

    public Animal(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}

