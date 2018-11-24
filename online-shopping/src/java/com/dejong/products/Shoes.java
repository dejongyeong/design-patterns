package com.dejong.products;

public class Shoes extends Product {

    private double size;

    public Shoes() {
        this.name = UNKNOWN;
        this.description = UNKNOWN;
        this.size = NO_VALUE;
        this.price = NO_VALUE;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
