package com.dejong.products;

import com.dejong.utilities.Utilities;

public class RunningShoes extends Shoes {

    public RunningShoes() {
        this.brand = Utilities.UNKNOWN;
        this.description = Utilities.UNKNOWN;
        this.size = Utilities.NO_VALUE;
        this.price = Utilities.NO_VALUE;
    }

    public RunningShoes(String brand, String description, double size, double price) {
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.price = price;
    }
}
