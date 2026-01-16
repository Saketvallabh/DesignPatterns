public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public String processPayment(){
        paymentStrategy.processPayment();
        return "Your payment has been processed";
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

}
