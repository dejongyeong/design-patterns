package com.dejong.product;

public class ItemFactory extends AbstractItemFactory {

    private Product product = null;

    protected Product create(ProductType type) {
        if(type.equals(ProductType.BOOKS)) {
            product = new Books();
        } else if(type.equals(ProductType.SHOES)) {
            product = new Shoes();
        } else {
            product = null;
        }

        return product;
    }
}
