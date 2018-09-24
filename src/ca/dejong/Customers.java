/**
 * Customer Class
 * Assume that each Customer has only one order.
 **/
package ca.dejong;

public class Customers {

    /* attributes */
    private String name;
    private String contact;
    private String address;
    private Orders order;

    public Customers(String name, String contact, String address, Orders order) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.order = order;
    }

    /** Accessors **/
    public String getName() { return name; }

    public String getContact() { return contact; }

    public String getAddress() { return address; }

    public Orders getOrder() { return order; }

    /** Payment method - by card or cash, returning payment details **/
    public String pay(PaymentStrategy paymentStrategy) {
        double total = order.calculateTotal();
        return paymentStrategy.pay(total);
    }

}
