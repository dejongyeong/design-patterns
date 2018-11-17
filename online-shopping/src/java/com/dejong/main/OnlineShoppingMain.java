package com.dejong.main;

import com.dejong.cart.ShoppingCart;
import com.dejong.delivery.*;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        IDelivery delivery = new StandardDelivery();
        delivery = new Insurances(new GiftCard(new WrappingServices(delivery)));

        ShoppingCart cart = new ShoppingCart(delivery);

        System.out.println(cart.getDescription() + "\nCost: " + cart.getCost());
    }
}
