
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012", "lavanya"));
        context.payBill(1500.00);

        context.setPaymentStrategy(new PayPalPayment("lavanya@example.com"));
        context.payBill(2200.50);
    }
}
