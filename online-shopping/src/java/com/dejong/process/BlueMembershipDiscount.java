package com.dejong.process;

public class BlueMembershipDiscount extends ProcessOrderTemplate {

    private final static double THREE_PERCENT = 0.03;

    protected double calculateDiscount(double productTotal) {
        return productTotal - (productTotal * THREE_PERCENT);
    }

}
