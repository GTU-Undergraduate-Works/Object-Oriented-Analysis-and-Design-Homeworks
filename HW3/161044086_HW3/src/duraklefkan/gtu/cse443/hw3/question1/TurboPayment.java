package duraklefkan.gtu.cse443.hw3.question1;

/**
 * Interface to represent turbo payment.
 */
public interface TurboPayment {

    /**
     *
     * @param turboCardNo card no to be paid
     * @param turboAmount amount of payment
     * @param destinationTurboOfCourse destination of payment
     * @param installmentsButInTurbo installments of payment
     * @return pay id of payment
     */
    int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}
