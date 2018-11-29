package com.dejong.display;

import com.dejong.products.CreateShoe;
import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductListTest {

    private Suppliers suppliers;
    private ProductList list;

    @BeforeEach
    void setUp() {
        ShoeCreator creator = new CreateShoe();
        suppliers = new Suppliers("Adidas", creator);
        list = new ProductList();

        // Invoke createShoe Method
        createProduct();
    }

    private void createProduct() {
        Shoes shoe = suppliers.createShoe(ShoeType.FLIP_FLOPS);

        shoe.setBrand("Adidas Mens Duramo Slide");
        shoe.setDescription("Perfect for beach holidays and poolside workouts, the adidas Duramo Slides are a classic must-have. These black sandals have a clean, quick-drying design for comfort and performance. Finished with iconic 3 Stripes on the strap for signature branded style.");
        shoe.setPrice(22);

        list.addProduct(shoe);
    }

    /** Ensure List has the items added **/
    @Test
    void testGetProducts() {
        List<Shoes> items = list.getProducts();
        assertTrue(items.size() > 0);
    }
}