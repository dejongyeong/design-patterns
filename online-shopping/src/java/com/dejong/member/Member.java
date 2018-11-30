package com.dejong.member;

import com.dejong.display.ProductList;
import com.dejong.newsletters.IObserver;
import com.dejong.products.Shoes;

public class Member implements IObserver {

    private String name;
    private String email;
    private String address;
    private String newsletters;
    private ProductList list = ProductList.INSTANCE;

    public Member(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void update(String news) {
        this.newsletters = news;
        this.display();
    }

    private void display() {
        System.out.println("Hello " + name + ", today news: " + newsletters);
    }

    public void displayProductList() {
        for(Shoes shoe : list.getProducts()) {
            System.out.println(shoe.toString());
        }
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
}
