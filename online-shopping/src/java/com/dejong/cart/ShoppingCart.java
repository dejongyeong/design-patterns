package com.dejong.cart;

import com.dejong.delivery.IDelivery;
import com.dejong.member.MembershipSimpleFactory;
import com.dejong.member.MembershipType;
import com.dejong.process.ProcessOrderTemplate;
import com.dejong.products.Shoes;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private IDelivery delivery;
    private List<Shoes> items;
    private MembershipSimpleFactory factory;

    public ShoppingCart() {
        delivery = null;
        factory = null;
        items = new LinkedList<Shoes>();
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

    public void placeOrder(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getOrder() {
        return items;
    }

    public void checkout(MembershipType type) {
        ProcessOrderTemplate template = factory.membership(type);
        template.processOrder(items, delivery);
    }
}
