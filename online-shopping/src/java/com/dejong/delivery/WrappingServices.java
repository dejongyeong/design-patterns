package com.dejong.delivery;

public class WrappingServices extends ServicesDecorator {

    private static final double WRAPPING = 5.50;

    public WrappingServices(IDelivery delivery) {
        super(delivery);
    }

    public String description() {
        return delivery.description() + " + Wrapping Services";
    }

    public double price() {
        return delivery.price() + WRAPPING;
    }
}
