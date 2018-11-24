package com.dejong.main;

import com.dejong.orders.ProductOrder;
import com.dejong.products.*;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        ProductFactory factory = new ProductFactory();
        ProductOrder order = new ProductOrder(factory);

        Product adidas = order.order(ProductType.SHOES);
        adidas.setName("Adidas");
        adidas.setDescription("Adidas Men Running Shoes");
        adidas.setPrice(80);

        System.out.println(adidas.getClass().getSimpleName() + "\n");

    }
}
