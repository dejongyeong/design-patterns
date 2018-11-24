package com.dejong.products;

public abstract class Product {

    protected static final String UNKNOWN = "UNKNOWN";
    protected static final double NO_VALUE = 0.0;

    protected String name;
    protected String description;
    protected double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
