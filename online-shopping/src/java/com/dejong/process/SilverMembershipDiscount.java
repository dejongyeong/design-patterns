package com.dejong.process;

public class SilverMembershipDiscount extends ProcessOrderTemplate {

    private final static double FIVE_PERCENT = 0.05;

    protected double calculateDiscount(double productTotal) {
        return productTotal - (productTotal * FIVE_PERCENT);
    }

    public double getDiscount() {
        return FIVE_PERCENT;
    }
}
