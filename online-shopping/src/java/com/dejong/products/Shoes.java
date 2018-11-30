package com.dejong.products;

import java.io.Serializable;

public abstract class Shoes implements Serializable {

    protected String supplier;
    protected String brand;
    protected String description;
    protected double price;

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

    public String toString() {
        return String.format("Supplier: %s\nName: %s\nPrice: €%.2f\n",
                getSupplier(),
                getBrand(),
                getPrice());
    }
}
