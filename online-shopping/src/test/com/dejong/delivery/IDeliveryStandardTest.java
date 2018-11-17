package com.dejong.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IDeliveryStandardTest {

    @Mock private IDelivery delivery;

    @BeforeEach
    void setUp() {
        delivery = new StandardDelivery();
    }

    @Test
    void testStandardDeliveryWithInsurances() {
        delivery = new Insurances(delivery);

        assertEquals(delivery.price(), 15.00);
    }

    @Test
    void testStandardDeliveryWithGiftCard() {
        delivery = new GiftCard(delivery);

        assertEquals(delivery.price(), 5.50);
    }

    @Test
    void testStandardDeliveryWithWrappingServices() {
        delivery = new WrappingServices(delivery);

        assertEquals(delivery.price(), 10.50);
    }

    @Test
    void testStandardDeliveryWithGiftCardAndWrappingServices() {
        delivery = new GiftCard(new WrappingServices(delivery));

        assertEquals(delivery.price(), 11.00);
    }

    @Test
    void testStandardDeliveryWithInsurancesAndGiftCardAndWrappingServices() {
        delivery = new Insurances(new GiftCard(new WrappingServices(delivery)));

        assertEquals(delivery.price(), 21.00);
    }
}
