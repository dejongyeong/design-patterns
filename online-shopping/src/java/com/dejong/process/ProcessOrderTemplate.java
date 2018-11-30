package com.dejong.process;

import com.dejong.cart.ShoppingCart;
import com.dejong.delivery.IDelivery;
import com.dejong.products.Shoes;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.util.Map;

public abstract class ProcessOrderTemplate {

    public final void processOrder(Map<String,Shoes> shoes, IDelivery delivery) {
        double productTotal = calculateProductTotal(shoes);
        double discountedPrice = calculateDiscount(productTotal);
        double deliveryPrice = calculateDeliveryPrice(delivery);
        double sum = calculateSum(discountedPrice, deliveryPrice);
        display(sum);
    }

    private double calculateProductTotal(@NotNull Map<String,Shoes> shoes) {
        double total = 0;
        for(Map.Entry<String, Shoes> entry : shoes.entrySet()) {
            total += entry.getValue().getPrice();
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

    protected abstract double getDiscount();

    private void display(double sum) {
        NumberFormat format = NumberFormat.getPercentInstance();
        String discount = format.format(getDiscount());
        System.out.println(String.format("Discount: %s\nSum: €%.2f",discount,sum));
    }

}
