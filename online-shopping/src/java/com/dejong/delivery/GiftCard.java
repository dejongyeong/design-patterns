package com.dejong.delivery;

public class GiftCard extends ServicesDecorator {

    private static final double GIFTCARD = 0.50;

    public GiftCard(IDelivery delivery) {
        super(delivery);
    }

    public String description() {
        return delivery.description() + " + Gift Card";
    }

    public double price() {
        return delivery.price() + GIFTCARD;
    }
}
