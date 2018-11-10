package com.dejong.discount;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IDiscountStrategyTest {

    @Mock // Mocks IDiscountStrategy interface.
    private IDiscountStrategy discount = mock(IDiscountStrategy.class);

    @InjectMocks // Inject mocks that are created with @Mock annotations into instance of class.
    private BlueMembership blueMembership = new BlueMembership();

    @InjectMocks
    private SilverMembership silverMembership = new SilverMembership();

    @InjectMocks
    private GoldMembership goldMembership = new GoldMembership();

    @InjectMocks
    private NoMembership noMembership = new NoMembership();

    @Test
    void testBlueMembership() {
        when(discount.calculate(100.00)).thenReturn(97.00); // 3% Discount Set Behavior
        assertEquals(blueMembership.calculate(100.00), 97.00);
    }

    @Test
    void testSilverMembership() {
        when(discount.calculate(100)).thenReturn(95.00); // 5% Discount Set Behavior
        assertEquals(silverMembership.calculate(100.00), 95.00);
    }

    @Test
    void testGoldMembership() {
        when(discount.calculate(100)).thenReturn(93.00); // 7% Discount Set Behavior
        assertEquals(goldMembership.calculate(100.00), 93.00);
    }

    @Test
    void testNoMembership() {
        when(discount.calculate(100)).thenReturn(100.00);
        assertEquals(noMembership.calculate(100.00), 100.00);
    }
}