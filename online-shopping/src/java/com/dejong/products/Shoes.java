package com.dejong.products;

public abstract class Shoes {

    String brand;
    String description;
    double price;
    double size;
    int quantity;

    public String getName() {
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

    public int getQuantity() { return quantity; }

    public void setName(String brand) {
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("Type: %s\nName: %s\nDescription: %s\nPrice: €%.2f\nQuantity: %d",
                this.getClass().getSimpleName(),
                getName(),
                getDescription(),
                getPrice(),
                getQuantity());
    }
}
