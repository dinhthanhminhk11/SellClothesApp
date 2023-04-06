package com.example.sellclothesapp.model;

public class Product {
    private int id;
    private String name;
    private String nameCategory;
    private String image;
    private float price;
    private float start;

    public Product(int id, String name, String nameCategory, String image, float price, float start) {
        this.id = id;
        this.name = name;
        this.nameCategory = nameCategory;
        this.image = image;
        this.price = price;
        this.start = start;
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
}
