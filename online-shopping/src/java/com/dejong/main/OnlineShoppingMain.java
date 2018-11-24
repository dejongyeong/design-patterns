package com.dejong.main;

import com.dejong.product.AbstractItemFactory;
import com.dejong.product.ItemFactory;
import com.dejong.product.Product;
import com.dejong.product.ProductType;

public class OnlineShoppingMain {
    public static void main(String args[]) {

        AbstractItemFactory factory = new ItemFactory();
        Product product = factory.order(ProductType.BOOKS);
        product.setPrice(58.54);
        System.out.println(product.toString());
    }
}
