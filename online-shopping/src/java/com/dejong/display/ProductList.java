package com.dejong.display;

import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;

import java.util.LinkedList;
import java.util.List;

public class ProductList {

    private List<Shoes> items;
    private static final ProductList INSTANCE = new ProductList();

    private ProductList() {
        this.items = new LinkedList<Shoes>();
    }

    public static ProductList getInstance() {
        return INSTANCE;
    }

    public void addProduct(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getProducts() {
        return items;
    }

}
