package com.dejong.delivery;

public class Insurances extends ServicesDecorator {

    private static final double INSURANCE = 10.00;

    public Insurances(IDelivery delivery) {
        super(delivery);
    }

    public String description() {
        return delivery.description() + " + Insurances";
    }

    public double price() {
        return delivery.price() + INSURANCE;
    }
}
