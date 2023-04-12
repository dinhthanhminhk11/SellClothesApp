package com.example.sellclothesapp.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String nameCategory;
    private String image;
    private float price;
    private float start;

    private String size;

    private String color;

    private int countFeedback;
    private String more;

    public Product() {
    }

    public Product(int id, String name, String nameCategory, String image, float price , int countFeedback , String more) {
        this.id = id;
        this.name = name;
        this.nameCategory = nameCategory;
        this.image = image;
        this.price = price;
        this.countFeedback = countFeedback;
        this.more = more;
    }

    public Product(int id, String name, String nameCategory, String image, float price, float start, String size, String color) {
        this.id = id;
        this.name = name;
        this.nameCategory = nameCategory;
        this.image = image;
        this.price = price;
        this.start = start;
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCountFeedback() {
        return countFeedback;
    }

    public String getMore() {
        return more;
    }
}
