package com.dejong.cart;

import com.dejong.delivery.IDelivery;
import com.dejong.products.Shoes;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private IDelivery delivery;
    private List<Shoes> items;

    private static ShoppingCart instance;

    private ShoppingCart() {
        delivery = null;
        items = new LinkedList<Shoes>();
    }

    public static synchronized ShoppingCart getInstance() {
        if(instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public String getDescription() {
        return this.delivery.description();
    }

    public double getDeliveryCost() {
        return this.delivery.price();
    }

    public void placeOrder(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getOrder() {
        return items;
    }
}
