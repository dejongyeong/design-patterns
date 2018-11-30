package com.dejong.products;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShoeTest {

    // Testing Purpose
    private static final String SUPPLIER = "Adidas";
    private static final String BRAND = "Adidas Originals Swift Run";
    private static final String DESCRIPTION = "Your running regime is upgraded with the Ultraboost - helping you reach the finish line in style. Made to be responsive, they include a 100% Boost midsole that springs into action without adding weight, whilst a Primeknit upper and supportive cage bring a locked down fit.";
    private static final double PRICE = 73.00;

    private Shoes shoe;

    @BeforeEach
    void init() {
        shoe = new RunningShoes();
        shoe.setSupplier(SUPPLIER);
        shoe.setBrand(BRAND);
        shoe.setDescription(DESCRIPTION);
        shoe.setPrice(PRICE);
    }

    @Test
    void testSettersMethod() {
        assertTrue(shoe instanceof RunningShoes);
        assertEquals(BRAND, shoe.getBrand());
        assertEquals(DESCRIPTION, shoe.getDescription());
        assertEquals(PRICE, shoe.getPrice());
        assertEquals(SUPPLIER, shoe.getSupplier());
    }

    @AfterEach
    void tearDown() {
        shoe = null;
    }
}
