package com.dejong.suppliers;

import com.dejong.products.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SuppliersTest {

    @Mock
    ShoeFactory creator;
    @Mock Suppliers suppliers;

    @BeforeEach
    void setUp() {
        creator = new ShoeCreator();
        suppliers = new Suppliers("Adidas", creator);
    }

    @AfterEach
    void tearDown() {
        suppliers = null;
        creator = null;
    }

    @Test
    void testGetName() {
        String expected = "Adidas";
        assertEquals(expected, suppliers.getName());
    }

    @Test
    void testCreateProduct() {
        Shoes shoe = suppliers.createShoe(ShoeType.FLIP_FLOPS);
        assertTrue(shoe instanceof FlipFlops);
    }
}