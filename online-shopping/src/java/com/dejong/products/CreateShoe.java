package com.dejong.products;

public class CreateShoe extends ShoeCreator {

    protected Shoes createProduct(ShoeType type) {
        if(type == ShoeType.RUNNING_SHOES) {
            return new RunningShoes();
        } else if(type == ShoeType.HIGH_HEELS) {
            return new HighHeels();
        } else if(type == ShoeType.FLIP_FLOPS) {
            return new FlipFlops();
        } else {
            throw new NullPointerException();     // No type found
        }
    }
}
