package com.srikar.springmvc.domain;

/**
 * Created by vedantas on 2/1/2018.
 */
public class Product {

    private String name;
    private String description;
    private float price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
