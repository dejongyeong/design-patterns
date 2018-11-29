package com.dejong.products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShoeFactoryTest {

    private ShoeFactory creator;
    private Shoes shoe;

    @BeforeEach
    void setUp() {
        creator = new ShoeCreator();
    }

    @Test
    void testCreateProductMethod() {
        shoe = creator.createProduct(ShoeType.FLIP_FLOPS);
        assertTrue(shoe instanceof FlipFlops);
    }

    @Test
    void testCreateMethod() {
        shoe = creator.create(ShoeType.HIGH_HEELS);
        assertTrue(shoe instanceof HighHeels);
    }

    @Test
    void testReturnRunningShoes() {
        shoe = creator.create(ShoeType.RUNNING_SHOES);
        assertTrue(shoe instanceof RunningShoes);
    }

    @Test
    void testThrowNullPointerException() {
        assertThrows(NullPointerException.class, new Executable() {
            public void execute() {
                shoe = creator.create(null);
            }
        });
    }
}
