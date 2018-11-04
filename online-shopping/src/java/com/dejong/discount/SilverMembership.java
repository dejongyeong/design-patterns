package com.dejong.discount;

public class SilverMembership implements IDiscountStrategy {

    private final static double FIVE_PERCENT = 0.05;

    public double calculate(double sum) {
        return sum - (sum * FIVE_PERCENT);
    }
}
