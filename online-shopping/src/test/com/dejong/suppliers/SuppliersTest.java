package com.dejong.suppliers;

import com.dejong.products.CreateShoe;
import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SuppliersTest {

    @Mock ShoeCreator creator;
    @Mock Suppliers suppliers;

    @BeforeEach
    void setUp() {
        suppliers = new Suppliers("Adidas", creator);
        creator = new CreateShoe();
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
        Shoes shoe = creator.create(ShoeType.FLIP_FLOPS);
        assertTrue(shoe instanceof  Shoes);
    }
}