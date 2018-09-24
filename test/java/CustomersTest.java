/**Testing of ca.dejong.Customers class. ca.dejong.Customers can pay for orders according to
 * different payment method. We are interested in testing the customer class
 * only, concerning that the customer does what it is supposed to do.
 **/

import ca.dejong.*;

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
        customers = new Customers("Joe", "0834124625", "Tralee", orders);
    }

    /** Pay By Cash Testing **/
    @Test
    public void testPayByCash() {

        String expected = "Payment: € 37.6 paid by cash.";
        String actual = customers.pay(new CashStrategy());

        assertEquals(expected, actual);
    }

    /** Pay By Card Testing **/
    @Test
    public void testPayByCard() {

        String expected = "Payment € 37.6 paid by card.\n" + "Card Details:\n Card Holder: John Doe\nCard Number: 4359874785145685\nCVV: 000\nExpiry Date: 12/20";
        String actual = customers.pay(new CreditCardStrategy("John Doe", "4359874785145685",000,"12/20"));

        assertNotEquals(expected, actual);
    }

    @After
    public void tearDown() {
        ordersItem = null;
        orders = null;
    }


}
