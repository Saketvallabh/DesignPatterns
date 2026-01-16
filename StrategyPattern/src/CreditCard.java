public class CreditCard implements PaymentStrategy {
    public void processPayment(){
        System.out.println("Your payment is processing via credit card");
    }
}
