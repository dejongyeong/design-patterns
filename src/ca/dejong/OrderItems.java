/**
 * OrderItems Class
 * Each order has at least one or many order items.
 **/
package ca.dejong;/* Each order has at least one or many order items */

public class OrderItems {

    /* attributes */
    private String itemCode;
    private double price;

    public OrderItems(String itemCode, double price) {
        this.itemCode = itemCode;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public double getPrice() {
        return price;
    }
}
