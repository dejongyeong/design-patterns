package com.dejong.main;

import com.dejong.member.Member;
import com.dejong.newsletters.ShoppingSystem;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        Member john = new Member("John", "john@gmail.com", "Dublin");
        Member jonathan = new Member("Jonathan", "jonathan@gmail.com", "Dublin");

        ShoppingSystem shoppingSystem = new ShoppingSystem();
        shoppingSystem.registerObserver(john);
        shoppingSystem.registerObserver(jonathan);

        shoppingSystem.setNews("Hello World");
    }
}
