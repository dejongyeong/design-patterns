package com.dejong.orders;

import com.dejong.products.Product;
import com.dejong.products.ProductFactory;
import com.dejong.products.ProductType;

public class ProductOrder {

    private ProductFactory factory;

    public ProductOrder(ProductFactory factory) {
        this. factory = factory;
    }

    public Product order(ProductType type) {

        Product product = factory.create(type);

        return product;
    }

}
