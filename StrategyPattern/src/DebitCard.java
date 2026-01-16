public class DebitCard implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Your payment is processing via debit card");
    }
}
