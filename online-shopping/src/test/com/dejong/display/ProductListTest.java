package com.dejong.display;

import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeFactory;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductListTest {

    private Suppliers suppliers;
    private ProductList list;

    @BeforeEach
    void setUp() {
        ShoeFactory creator = new ShoeCreator();
        suppliers = new Suppliers("Adidas", creator);
        list = ProductList.INSTANCE;

        // Invoke createShoe Method
        createProduct();
    }

    private void createProduct() {
        Shoes shoe = suppliers.createShoe(ShoeType.FLIP_FLOPS);

        shoe.setID("A001");
        shoe.setSupplier(suppliers.getName());
        shoe.setBrand("Adidas Mens Duramo Slide");
        shoe.setDescription("Perfect for beach holidays and poolside workouts, the adidas Duramo Slides are a classic must-have. These black sandals have a clean, quick-drying design for comfort and performance. Finished with iconic 3 Stripes on the strap for signature branded style.");
        shoe.setPrice(22);

        list.addProduct(shoe.getID(), shoe);
    }

    /** Ensure List has the items added **/
    @Test
    void testGetProducts() {
        Map<String,Shoes> items = list.getProducts();
        assertTrue(items.size() > 0);
    }
}