/* Customer Class*/

public class Customers {

    /* attributes */
    private String name;
    private String email;
    private String contact;
    private String address;
    private Orders order;
    private PaymentMethod paymentMethod;

    public Customers(String name, String email, String contact, String address, Orders order, PaymentMethod paymentMethod) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.order = order;
        this.paymentMethod = paymentMethod;
    }

    /* Getters Method */
    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getContact() { return contact; }

    public String getAddress() { return address; }

    public Orders getOrder() { return order; }

    public PaymentMethod getPaymentMethod() { return paymentMethod; }

    /* Payment - Either by card or cash */
    public void pay() {
        if(paymentMethod == PaymentMethod.CASH) {
            System.out.println("Paid By: " + paymentMethod + "\nTotal: " + order.calculateTotal());
        } else {
            System.out.println("Paid By: " + paymentMethod + "\nTotal: " + order.calculateTotal());
        }
    }

}
