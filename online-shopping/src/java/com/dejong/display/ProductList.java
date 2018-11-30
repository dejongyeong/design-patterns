package com.dejong.display;

import com.dejong.products.Shoes;
import org.jetbrains.annotations.Contract;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public enum ProductList {

    INSTANCE;

    private Map<String, Shoes> items;

    ProductList() {
        items = new TreeMap<String, Shoes>();
    }

    public void addProduct(String id, Shoes item) {
        items.put(id, item);
    }

    @Contract(pure = true)
    public Map<String, Shoes> getProducts() {
        return items;
    }

    public void displayProductList() {
        for(Map.Entry<String, Shoes> entry : items.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

}
