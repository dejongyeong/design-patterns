package com.dejong.cart;

import com.dejong.delivery.IDelivery;
import com.dejong.product.Product;
import com.dejong.product.ProductSimpleFactory;

public class ShoppingCart {

    private IDelivery delivery;
    private ProductSimpleFactory factory;

    public ShoppingCart(IDelivery delivery, ProductSimpleFactory factory) {
        this.delivery = delivery;
        this.factory = factory;
    }

    public String getDescription() {
        return this.delivery.description();
    }

    public double getCost() {
        return this.delivery.price();
    }

    public Product orders(String type) {
        Product product = ProductSimpleFactory.ordering(type);
        return product;
    }
}
