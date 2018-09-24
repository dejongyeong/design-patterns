package ca.dejong;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardHolder;
    private String cardNumber;
    private int cvv;
    private String expiryDate;

    public CreditCardStrategy(String cardHolder, String cardNumber, int cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public String pay(double amount) {
        return "Payment € " + amount + " paid by card.\n" + this.displayCardDetails();
    }

    /** Can only be accessed from within this class only **/
    private String displayCardDetails() {
        return "Card Details:\n Card Holder: " + cardHolder + "\nCard Number: " + cardNumber + "\nCVV: " + cvv + "\nExpiry Date: " + expiryDate;
    }
}
