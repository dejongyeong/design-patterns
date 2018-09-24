/**Testing of ca.dejong.Customers class. ca.dejong.Customers can pay for orders according to
 * different payment method. We are interested in testing the customer class
 * only, concerning that the customer does what it is supposed to do.
 **/

import ca.dejong.Customers;
import ca.dejong.OrderItems;
import ca.dejong.Orders;
import ca.dejong.PaymentStrategy;

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
        customers = new Customers("Joe", "0834124625", "Tralee", orders, PaymentStrategy.CASH);
    }

    /** Positive Testing **/
    @Test
    public void testPayPositive() {

        String expected = "Paid By: CASH" + "\nTotal: 37.6";
        String actual = "Paid By: " + customers.getPaymentStrategy() + "\nTotal: " + orders.calculateTotal();

        assertEquals(expected, actual);
    }

    /** Negative Testing **/
    @Test
    public void testPayNegative() {

        String expected = "Paid By: CARD" + "\nTotal: 38.6";
        String actual = "Paid By: " + customers.getPaymentStrategy() + "\nTotal: " + orders.calculateTotal();

        assertNotEquals(expected, actual);
    }

    @After
    public void tearDown() {
        ordersItem = null;
        orders = null;
    }


}
