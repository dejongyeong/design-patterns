/* Customer Class*/

public class Customers {

    /* attributes */
    private String name;
    private String email;
    private String contact;
    private String address;
    private Orders order;

    public Customers(String name, String email, String contact, String address, Orders order) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.order = order;
    }

    /* Getters Method */
    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getContact() { return contact; }

    public String getAddress() { return address; }

    public Orders getOrder() { return order; }

}
