package com.dejong.suppliers;

import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;

public class Suppliers {

    private String name;
    private ShoeCreator creator;

    public Suppliers(String name, ShoeCreator creator) {
        this.name = name;
        this.creator = creator;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreator(ShoeCreator creator) {
        this.creator = creator;
    }

    public Shoes createProduct(ShoeType type) {
        return creator.create(type);
    }
}
