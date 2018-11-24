package com.dejong.product;

public class Product {

    public Product ordering(String type) {

        Product product = null;

        if(type.equalsIgnoreCase("shoe")) {
            product = new Shoe();
        } else if(type.equalsIgnoreCase("cloth")) {
            product = new Cloth();
        } else if(type.equalsIgnoreCase("book")) {
            product = new Book();
        }

        return product;
    }
}


