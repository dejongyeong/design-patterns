package com.dejong.products;

import java.io.Serializable;

public abstract class Shoes implements Serializable {

    String id;
    String supplier;
    String brand;
    protected String description;
    protected double price;

    public String getID() { return id; }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getSupplier() { return supplier; }

    public double getPrice() {
        return price;
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

    public void setSupplier(String supplier) { this.supplier = supplier; }

    public void setID(String id) { this.id = id; }

    public String toString() {
        return String.format("ID: %s\nSupplier: %s\nName: %s\nPrice: €%.2f\n",
                getID(),
                getSupplier(),
                getBrand(),
                getPrice());
    }
}
