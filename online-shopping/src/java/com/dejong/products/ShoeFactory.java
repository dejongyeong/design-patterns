package com.dejong.products;

public abstract class ShoeFactory {

    abstract Shoes createProduct(ShoeType type);

    public Shoes create(ShoeType type) {
        return createProduct(type);
    }
}

