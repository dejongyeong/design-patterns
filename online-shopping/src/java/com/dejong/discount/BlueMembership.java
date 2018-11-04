package com.dejong.discount;

public class BlueMembership implements IDiscountStrategy {

    private final static double THREE_PERCENT = 0.03;
    
    public double calculate(double sum) {
        return sum - (sum * THREE_PERCENT);
    }
}
