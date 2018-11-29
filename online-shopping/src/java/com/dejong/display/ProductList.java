package com.dejong.display;

import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;

import java.util.LinkedList;
import java.util.List;

public class ProductList {

    private List<Shoes> items;
    private volatile static ProductList INSTANCE;

    private ProductList() {
        this.items = new LinkedList<Shoes>();
    }

    public static ProductList getInstance() {
        if(INSTANCE == null) {
            synchronized (ProductList.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ProductList();
                }
            }
        }
        return INSTANCE;
    }

    public void addProduct(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getProducts() {
        return items;
    }

}
