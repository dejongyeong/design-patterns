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
    private PaymentStrategy paymentStrategy;

    public Customers(String name, String contact, String address, Orders order, PaymentStrategy paymentStrategy) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.order = order;
        this.paymentStrategy = paymentStrategy;
    }

    /* Getters Method */
    public String getName() { return name; }

    public String getContact() { return contact; }

    public String getAddress() { return address; }

    public Orders getOrder() { return order; }

    public PaymentStrategy getPaymentStrategy() { return paymentStrategy; }

    /* Payment - Either by card or cash */
    public void pay() {
        if(paymentStrategy == PaymentStrategy.CASH) {
            System.out.println("Paid By: " + paymentStrategy + "\nTotal: " + order.calculateTotal());
        } else {
            System.out.println("Paid By: " + paymentStrategy + "\nTotal: " + order.calculateTotal());
        }
    }

}
