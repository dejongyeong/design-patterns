package com.dejong.delivery;

public class StandardDelivery implements IDelivery {

    private final static double STANDARD = 5.00;

    public double price() {
        return STANDARD;
    }

    public String description() {
        return "Standard Delivery";
    }
}
