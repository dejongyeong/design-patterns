package com.dejong.delivery;

public class PrimeDelivery implements IDelivery {

    private final static double PRIME = 12.50;

    public double price() {
        return PRIME;
    }

    public String description() {
        return "Prime Delivery";
    }
}
