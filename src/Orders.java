/* Orders Class */

import java.util.List;

public class Orders {

    /* attributes */
    private List<OrderItems> orderItems;
    private PaymentMethod paymentMethod;

    /* Dependency Injection - Constructor */
    public Orders(List<OrderItems> orderItems, PaymentMethod paymentMethod) {
        this.orderItems = orderItems;
        this.paymentMethod = paymentMethod;
    }

    public void addItems(OrderItems orderItems) {
        this.orderItems.add(orderItems);
    }

    public void removeItems(OrderItems orderItems) {
        this.orderItems.remove(orderItems);
    }

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    /* Can only be access from within the class only */
    private double calculateTotal() {
        double total = 0.0;
        for (var o : orderItems) {
            total += o.getPrice();
        }
        return total;
    }

    /* Payment */
    public void pay() {
        if(this.paymentMethod == PaymentMethod.CASH) {
            System.out.println("Payment Method: " + PaymentMethod.CASH + "\nTotal: " + this.calculateTotal());
        } else if(this.paymentMethod == PaymentMethod.CARD) {
            System.out.println("Payment Method: " + PaymentMethod.CARD + "\nTotal: " + this.calculateTotal());
        }
    }
}
