package com.dejong.display;

import com.dejong.products.Shoes;

import java.util.LinkedList;
import java.util.List;

public enum ProductList {

    INSTANCE;

    private List<Shoes> items;

    ProductList() {
        items = new LinkedList<Shoes>();
    }

    public void addProduct(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getProducts() {
        return items;
    }

}
