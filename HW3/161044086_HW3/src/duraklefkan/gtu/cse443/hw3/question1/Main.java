package duraklefkan.gtu.cse443.hw3.question1;

/**
 * duraklefkan.gtu.cse443.hw3.question3.Main class to test Adapter Design Pattern.
 */
public class Main {

    /**
     * main method
     * @param args main arguments
     */
    public static void main(String[] args) {


            System.out.println("--------------- ADAPTER DESIGN PATTERN TEST ---------------\n");
            CreditCardPaymentTurbo creditCardPaymentTurbo = new CreditCardPaymentTurbo();
            CreditCardPaymentModern creditCardPaymentModern = new CreditCardPaymentModern();
            PaymentAdapter paymentAdapter = new PaymentAdapter(creditCardPaymentModern);


            System.out.println("**************** TURBO PAYMENT BEHAVIOR ****************");
            creditCardPaymentTurbo.payInTurbo("123456789", 5000, "Erzincan", "12");
            System.out.println("**************** MODERN PAYMENT BEHAVIOR ****************");
            creditCardPaymentModern.pay("123456789", 5000, "Erzincan", "12");
            System.out.println("**************** ADAPTER PAYMENT BEHAVIOR ****************");
            paymentAdapter.payInTurbo("123456789", 5000, "Erzincan", "12");


    }
}
