package com.dejong.display;

import com.dejong.products.Shoes;
import org.jetbrains.annotations.Contract;

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

    @Contract(pure = true)
    public List<Shoes> getProducts() {
        return items;
    }

    public void displayProductList() {
        int count = 1;
        for(Shoes shoe : this.getProducts()) {
            System.out.println(count);
            System.out.println(shoe.toString());
            count++;
        }
    }

}
