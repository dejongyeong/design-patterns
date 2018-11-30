package com.dejong.process;

public class NoMembershipDiscount extends ProcessOrderTemplate {

    private final static double ZERO_PERCENT = 0.00;

    protected double calculateDiscount(double productTotal) {
        return productTotal - (productTotal * ZERO_PERCENT);
    }
}
