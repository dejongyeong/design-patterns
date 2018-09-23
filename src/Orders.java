/* Orders Class */

import java.util.List;

public class Orders {

    /* attributes */
    private List<OrderItems> orderItems;

    /* Dependency Injection - Constructor */
    public Orders(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
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

    public double calculateTotal() {
        double total = 0.0;
        for (var o : orderItems) {
            total += o.getPrice();
        }
        return total;
    }
}
