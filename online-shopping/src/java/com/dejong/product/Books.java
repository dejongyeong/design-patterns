package com.dejong.product;

public class Books extends Product {

    private static final String UNKNOWN = "Unknown";
    private static final double NO_PRICE = 0.0;

    public Books() {
        this.name = UNKNOWN;
        this.description = UNKNOWN;
        this.price = NO_PRICE;
    }

}
