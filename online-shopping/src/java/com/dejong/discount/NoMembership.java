package com.dejong.discount;

public class NoMembership implements IDiscountStrategy {

    private final static double ZERO_PERCENT = 0.00;

    public double calculate(double sum) {
        return sum - (sum * ZERO_PERCENT);
    }
}
