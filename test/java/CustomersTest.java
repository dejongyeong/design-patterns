/**Testing of Customers class. Customers can pay for orders according to
 * different payment method. We are interested in testing the customer class
 * only, concerning that the customer does what it is supposed to do.
 **/

import java.util.List;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomersTest {

    private Customers customers;
    private List<OrderItems> ordersItem;
    private Orders orders;

    @Before
    public void setUp() {
        ordersItem = new ArrayList<>();
        ordersItem.add(new OrderItems("FC01", 10.0));
        ordersItem.add(new OrderItems("LS02", 15.2));
        ordersItem.add(new OrderItems("IB03", 12.4));

        orders = new Orders(ordersItem);
        customers = new Customers("Joe", "joe@gmail.com", "0834124625", "Tralee", orders, PaymentMethod.CASH);
    }

    /** Positive Testing **/
    @Test
    public void testPayPositive() {

        String expected = "Paid By: CASH" + "\nTotal: 37.6";
        String actual = "Paid By: " + customers.getPaymentMethod() + "\nTotal: " + orders.calculateTotal();

        assertEquals(expected, actual);
    }

    /** Negative Testing **/
    @Test
    public void testPayNegative() {

        String expected = "Paid By: CARD" + "\nTotal: 38.6";
        String actual = "Paid By: " + customers.getPaymentMethod() + "\nTotal: " + orders.calculateTotal();

        assertNotEquals(expected, actual);
    }

    @After
    public void tearDown() {
        ordersItem = null;
        orders = null;
    }


}
