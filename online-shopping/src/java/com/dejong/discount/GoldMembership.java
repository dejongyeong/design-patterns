package com.dejong.discount;

public class GoldMembership implements IDiscountStrategy {

    private final static double SEVEN_PERCENT = 0.07;

    public double calculate(double sum) {
        return sum - (sum * SEVEN_PERCENT);
    }
}
