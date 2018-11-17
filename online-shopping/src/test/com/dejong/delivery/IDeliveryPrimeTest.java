package com.dejong.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IDeliveryPrimeTest {

    @Mock private IDelivery delivery;

    @BeforeEach
    void setUp() {
        delivery = new PrimeDelivery();
    }

    @Test
    void testPrimeDeliveryWithInsurances() {
        delivery = new Insurances(delivery);

        assertEquals(delivery.price(), 22.50);
    }

    @Test
    void testPrimeDeliveryWithGiftCard() {
        delivery = new GiftCard(delivery);

        assertEquals(delivery.price(), 13.00);
    }

    @Test
    void testPrimeDeliveryWithWrappingServices() {
        delivery = new WrappingServices(delivery);

        assertEquals(delivery.price(), 18.00);
    }

    @Test
    void testPrimeDeliveryWithGiftCardAndWrappingServices() {
        delivery = new GiftCard(new WrappingServices(delivery));

        assertEquals(delivery.price(), 18.50);
    }

    @Test
    void testPrimeDeliveryWithInsurancesAndGiftCardAndWrappingServices() {
        delivery = new Insurances(new GiftCard(new WrappingServices(delivery)));

        assertEquals(delivery.price(), 28.50);
    }
}
