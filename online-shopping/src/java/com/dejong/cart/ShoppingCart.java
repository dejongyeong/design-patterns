package com.dejong.cart;

import com.dejong.delivery.IDelivery;
import com.dejong.member.MembershipSimpleFactory;
import com.dejong.member.MembershipType;
import com.dejong.process.ProcessOrderTemplate;
import com.dejong.products.Shoes;

import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    private IDelivery delivery;
    private Map<String, Shoes> items;
    private MembershipSimpleFactory factory;

    public ShoppingCart() {
        delivery = null;
        factory = null;
        items = new TreeMap<String, Shoes>();
    }

    public void setMembershipFactory(MembershipSimpleFactory factory) {
        this.factory = factory;
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

    public void placeOrder(String id, Shoes item) {
        items.put(id, item);
    }

    public Map<String, Shoes> getOrder() {
        return items;
    }

    public void checkout(MembershipType type) {
        ProcessOrderTemplate template = factory.membership(type);
        template.processOrder(items, delivery);
    }
}
