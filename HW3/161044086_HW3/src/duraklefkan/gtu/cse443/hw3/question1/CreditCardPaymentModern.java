package duraklefkan.gtu.cse443.hw3.question1;

/**
 * Concrete class that implements ModernPayment interface.
 */
public class CreditCardPaymentModern implements ModernPayment {

    /**
     * {@inheritDoc}
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("-----   MODERN PAYMENT -----");
        System.out.println("Card No : " + cardNo);
        System.out.println("Amount : " + amount);
        System.out.println("Destination : " + destination);
        System.out.println("Installments : " + installments);
        System.out.println("Payment is completed.\n");
        return 1;
    }
}
