package com.dejong.products;

import com.dejong.utilities.Utilities;

public class HighHeels extends Shoes {

    public HighHeels() {
        this.supplier = Utilities.UNKNOWN;
        this.brand = Utilities.UNKNOWN;
        this.description = Utilities.UNKNOWN;
        this.price = Utilities.NO_VALUE;
    }

    public HighHeels(String supplier, String brand, String description, double price) {
        this.supplier = supplier;
        this.brand = brand;
        this.description = description;
        this.price = price;
    }

}
