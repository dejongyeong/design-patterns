package com.dejong.display;

import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;

import java.util.LinkedList;
import java.util.List;

public class ProductList {

    private List<Shoes> items;
    private Suppliers suppliers;

    public ProductList(Suppliers suppliers) {
        this.suppliers = suppliers;
        this.items = new LinkedList<Shoes>();
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void addProduct(Shoes item) {
        items.add(item);
    }

    public List<Shoes> getProducts() {
        return items;
    }

}
