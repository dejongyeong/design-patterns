package com.dejong.suppliers;

import com.dejong.products.ShoeFactory;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;

public class Suppliers {

    private String name;
    private ShoeFactory creator;

    public Suppliers(String name, ShoeFactory creator) {
        this.name = name;
        this.creator = creator;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreator(ShoeFactory creator) {
        this.creator = creator;
    }

    public Shoes createShoe(ShoeType type) {
        return creator.create(type);
    }
}
