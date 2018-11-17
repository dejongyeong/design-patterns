package com.dejong.cart;

import com.dejong.delivery.IDelivery;

public class ShoppingCart {

    private IDelivery delivery;

    public ShoppingCart(IDelivery delivery) {
        this.delivery = delivery;
    }

    public String getDescription() {
        return this.delivery.description();
    }

    public double getCost() {
        return this.delivery.price();
    }
}
