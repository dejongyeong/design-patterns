package com.dejong.cart;

import com.dejong.delivery.IDelivery;
import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;

import java.util.List;

public class ShoppingCart {

    private IDelivery delivery;
    private ShoeCreator creator;
    private List<Shoes> items;

    public ShoppingCart() {
        delivery = null;
        creator = null;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public void setCreator(ShoeCreator creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return this.delivery.description();
    }

    public double getDeliveryCost() {
        return this.delivery.price();
    }

    public Shoes createOrder(ShoeType type) {
        return creator.order(type);
    }

    public void placeOrder(List<Shoes> items) {
        this.items = items;
    }

    public List<Shoes> getOrder() {
        return items;
    }
}
