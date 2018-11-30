package com.dejong.products;

public abstract class Shoes {

    protected String brand;
    protected String description;
    protected double price;
    protected double size;

    public String getBrand() {
        return brand;
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


    public void setBrand(String brand) {
        this.brand = brand;
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
        return String.format("Name: %s\nDescription: %s\nPrice: €%.2f\n",
                getBrand(),
                getDescription(),
                getPrice());
    }
}
