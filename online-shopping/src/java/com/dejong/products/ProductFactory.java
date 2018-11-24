package com.dejong.products;

public class ProductFactory {

    public Product create(ProductType type) {

        Product product = null;

        if(type == ProductType.SHOES) {
            product = new Shoes();
        } else if(type == ProductType.ELECTRONICS) {
            product = new Electronics();
        } else {
            throw new NullPointerException();
        }

        return product;
    }
}
