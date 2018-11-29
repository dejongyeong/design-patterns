package com.dejong.products;

public class ShoeCreator extends ShoeFactory {

    Shoes createProduct(ShoeType type) {
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
