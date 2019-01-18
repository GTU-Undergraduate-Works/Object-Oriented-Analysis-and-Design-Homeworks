package duraklefkan.gtu.cse443.hw3.question1;

/**
 * Interface to represent modern payment.
 */
public interface ModernPayment {

    /**
     *
     * @param cardNo card no to be paid
     * @param amount amount of payment
     * @param destination destination of payment
     * @param installments installments of payment
     * @return pay id of payment
     */
    int pay(String cardNo, float amount, String destination, String installments);
}
