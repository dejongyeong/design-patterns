package com.dejong.member;

import com.dejong.discount.IDiscountStrategy;
import com.dejong.newsletters.IObserver;

public class Member implements IObserver {

    private String name;
    private String email;
    private String address;
    private String newsletters;
    private IDiscountStrategy iDiscountStrategy;

    public Member(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() { return address; }

    public void setDiscountStrategy(IDiscountStrategy iDiscountStrategy) {
        this.iDiscountStrategy = iDiscountStrategy;
    }

    public IDiscountStrategy getIDiscountStrategy() { return iDiscountStrategy; }

    public void update(String news) {
        this.newsletters = news;
        this.display();
    }

    private void display() {
        System.out.println("Hello " + name + ", today news: " + newsletters);
    }
}
