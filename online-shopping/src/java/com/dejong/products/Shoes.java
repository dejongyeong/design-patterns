package com.dejong.products;

public abstract class Shoes {

    String name;
    String description;
    double price;
    double size;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
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

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return String.format("Type: %s\nName: %s\nDescription: %s\nPrice: €%.2f",
                this.getClass().getSimpleName(),
                getName(),
                getDescription(),
                getPrice());
    }
}
