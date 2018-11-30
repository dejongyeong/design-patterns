package com.dejong.process;

import com.dejong.cart.ShoppingCart;
import com.dejong.delivery.IDelivery;
import com.dejong.products.Shoes;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class ProcessOrderTemplate {

    public final void processOrder(List<Shoes> shoes, IDelivery delivery) {
        double productTotal = calculateProductTotal(shoes);
        double discountedPrice = calculateDiscount(productTotal);
        double deliveryPrice = calculateDeliveryPrice(delivery);
        double sum = calculateSum(discountedPrice, deliveryPrice);
        display(sum);
    }

    private double calculateProductTotal(@NotNull List<Shoes> shoes) {
        double total = 0;
        for(Shoes shoe : shoes) {
            total += shoe.getPrice();
        }
        return total;
    }

    private double calculateDeliveryPrice(IDelivery delivery) {
        ShoppingCart cart = new ShoppingCart();
        cart.setDelivery(delivery);
        return cart.getDeliveryCost();
    }

    protected abstract double calculateDiscount(double productTotal);

    @Contract(pure = true)
    private double calculateSum(double discountedPrice, double deliveryPrice) {
        return discountedPrice + deliveryPrice;
    }

    private void display(double sum) {
        System.out.println("Sum: " + sum);
    }

}
