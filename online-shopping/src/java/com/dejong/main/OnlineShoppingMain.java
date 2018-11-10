package com.dejong.main;

import com.dejong.member.Member;
import com.dejong.newsletters.Newsletters;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        Member john = new Member("John", "john@gmail.com", "Dublin");
        Member jonathan = new Member("Jonathan", "jonathan@gmail.com", "Dublin");

        Newsletters newsletters = new Newsletters();
        newsletters.registerObserver(john);
        newsletters.registerObserver(jonathan);

        newsletters.setNews("Hello World");
    }
}
