package com.example.sellclothesapp.model;

public class Size {
    private int id;
    private String name;

    public Size(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
