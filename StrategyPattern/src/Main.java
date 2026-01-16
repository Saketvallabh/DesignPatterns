//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Credit Card");
        System.out.println("Debit Card");
        System.out.println("UPI");
        System.out.println("Amazon Pay");
        System.out.println("Choose your payment method by entering it");
        String paymentMethod = scanner.nextLine();
        PaymentStrategy paymentStrategy;
        switch(paymentMethod){
            case "Credit Card" :
                paymentStrategy = new CreditCard();
                break;
            case "Debit Card" :
                paymentStrategy = new DebitCard();
                break;
            case "UPI" :
                paymentStrategy = new UPI();
                break;
            case "Amazon Pay" :
                paymentStrategy = new AmazonPay();
                break;
            default :
                paymentStrategy = new CreditCard();
                break;
        }
        PaymentProcessor process = new PaymentProcessor(paymentStrategy);
        String status = process.processPayment();
        System.out.println(status);
    }
}