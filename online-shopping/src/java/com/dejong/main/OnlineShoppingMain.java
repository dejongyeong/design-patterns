package com.dejong.main;

import java.io.IOException;

public class OnlineShoppingMain {

    public static void main(String args[]) throws IOException {
        display();
    }

    private static void display() throws IOException {
        GenerateProduct product = new GenerateProduct();
        product.displayProduct();
    }
}
