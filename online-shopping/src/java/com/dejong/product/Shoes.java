package com.dejong.product;

public class Shoes extends Product {

    private static final String UNKNOWN = "Unknown";
    private static final double NO_PRICE = 0.0;
    private static final double NO_SIZE = 0.0;
    private double size;

    public Shoes() {
        this.name = UNKNOWN;
        this.description = UNKNOWN;
        this.price = NO_PRICE;
        this.size = NO_SIZE;
    }

    public double getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public String toString() {
        return String.format("Product: %s\nName: %s\nDescription: %s\nSize: %f\nPrice: %f",
                this.getClass().getSimpleName(),
                getName(),
                getDescription(),
                getSize(),
                getPrice());
    }

}
