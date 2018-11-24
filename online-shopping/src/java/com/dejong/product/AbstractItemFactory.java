package com.dejong.product;

public abstract class AbstractItemFactory {

    public Product order(ProductType type) {
        if(type == null) {
            return null;
        }

        Product item = create(type);

        return item;
    }

    protected abstract Product create(ProductType type);

}
