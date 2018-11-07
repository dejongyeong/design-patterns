package com.dejong.member;

import com.dejong.discount.IDiscountStrategy;

public class Member {

    private IDiscountStrategy iDiscountStrategy;

    // Constructor Injection
    public Member(IDiscountStrategy iDiscountStrategy) {
        this.iDiscountStrategy = iDiscountStrategy;
    }

    // Setter Injection
    public void setDiscountStrategy(IDiscountStrategy iDiscountStrategy) {
        this.iDiscountStrategy = iDiscountStrategy;
    }
}
