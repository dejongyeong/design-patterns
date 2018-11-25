package com.dejong.main;

import com.dejong.cart.ShoppingCart;
import com.dejong.products.OrderShoe;
import com.dejong.products.*;

import java.util.LinkedList;
import java.util.List;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        ShoppingCart cart = new ShoppingCart();
        ShoeCreator order = new OrderShoe();

        cart.setCreator(order);

        // Dependency Injection
        Shoes adidas = cart.createOrder(ShoeType.FLIP_FLOPS);
        adidas.setName("Adidas");
        adidas.setDescription("Adidas Men Running HighHeels");
        adidas.setSize(7.5);
        adidas.setPrice(80);

        Shoes nike = cart.createOrder(ShoeType.RUNNING_SHOES);
        nike.setName("Nike");
        nike.setDescription("Nike Running Shoes");
        nike.setSize(6.5);
        nike.setPrice(55);

        List<Shoes> items = new LinkedList<Shoes>();
        items.add(adidas);
        items.add(nike);

        cart.placeOrder(items);

        System.out.println(cart.getOrder().size());

    }
}
