package com.dejong.product;

public abstract class Product {

    String name;
    String description;
    double price;

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

    public String toString() {
        return String.format("Product: %s\nName: %s\nDescription: %s\nPrice: %.2f",
                this.getClass().getSimpleName(),
                getName(),
                getDescription(),
                getPrice());
    }

}
