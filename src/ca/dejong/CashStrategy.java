package ca.dejong;

public class CashStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Payment: € " + amount + " paid by cash.";
    }
}
