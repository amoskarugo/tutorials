package OOP.Abstraction.Interface;

public class Application {

    // Our application uses the Interface type, not a specific concrete class
    private final PaymentGateway currentGateway;

    public Application(PaymentGateway gateway) {
        this.currentGateway = gateway;
    }

    public void completePurchase(double amount, String userToken) {
        System.out.println("--- Starting Purchase Process ---");

        // We can call processPayment() regardless of the underlying object type
        boolean success = currentGateway.processPayment(amount, userToken);

        if (success) {
            System.out.println("Purchase successful!");
            currentGateway.logTransaction("TX12345"); // Using the default method
        } else {
            System.out.println("Purchase failed.");
        }
    }

    public static void main(String[] args) {
        // Use PayPal implementation
        PaymentGateway payPal = new PayPalGateway();
        Application app1 = new Application(payPal);
        app1.completePurchase(100.50, "token_paypal_xyz");

        System.out.println("\n----------------------------------\n");

        // Easily switch to Stripe implementation without changing Application logic
        PaymentGateway stripe = new StripeGateway();
        Application app2 = new Application(stripe);
        app2.completePurchase(50.00, "token_stripe_abc");
    }
}
