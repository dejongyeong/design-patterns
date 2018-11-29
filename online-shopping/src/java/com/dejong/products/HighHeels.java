package com.dejong.products;

import com.dejong.utilities.Utilities;

public class HighHeels extends Shoes {

    public HighHeels() {
        this.brand = Utilities.UNKNOWN;
        this.description = Utilities.UNKNOWN;
        this.size = Utilities.NO_VALUE;
        this.price = Utilities.NO_VALUE;
    }

    public HighHeels(String brand, String description, double size, double price) {
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.price = price;
    }

}
