package com.dejong.process;

public class GoldMembershipDiscount extends ProcessOrderTemplate {

    private final static double SEVEN_PERCENT = 0.07;

    protected double calculateDiscount(double productTotal) {
        return productTotal - (productTotal * SEVEN_PERCENT);
    }
}
