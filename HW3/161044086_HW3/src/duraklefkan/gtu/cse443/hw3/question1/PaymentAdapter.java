package duraklefkan.gtu.cse443.hw3.question1;

/**
 * Adapter Class to adapte TurboPayment to ModernPayment.
 */
public class PaymentAdapter implements TurboPayment {

    private ModernPayment modernPayment;

    /**
     * Construct PaymentAdapter object with given modern adapter
     * @param modernPayment modern payment to adapt
     */
    public PaymentAdapter(ModernPayment modernPayment) {
        this.modernPayment = modernPayment;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        return modernPayment.pay(turboCardNo, turboAmount, destinationTurboOfCourse, installmentsButInTurbo);
    }
}
