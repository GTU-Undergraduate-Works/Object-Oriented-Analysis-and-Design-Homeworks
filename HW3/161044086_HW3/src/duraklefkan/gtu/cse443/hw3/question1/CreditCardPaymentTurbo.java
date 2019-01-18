package duraklefkan.gtu.cse443.hw3.question1;

/**
 * Concrete class that implements TurboPayment interface.
 */
public class CreditCardPaymentTurbo implements TurboPayment {

    /**
     * {@inheritDoc}
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("----- TURBO PAYMENT -----");
        System.out.println("Card No : " + turboCardNo);
        System.out.println("Amount : " + turboAmount);
        System.out.println("Destination : " + destinationTurboOfCourse);
        System.out.println("Installments : " + installmentsButInTurbo);
        System.out.println("Payment is completed.\n");
        return 1;
    }
}
