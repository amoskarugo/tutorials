package OOP.Abstraction.Interface;

public class StripeGateway implements PaymentGateway {

    @Override
    public boolean processPayment(double amount, String token) {
        // Specific complex logic to call Stripe's API endpoints
        System.out.println("Initiating Stripe transaction for $" + amount);
        // Simulate API call success/failure
        return true;
    }

    @Override
    public String checkStatus(String transactionId) {
        // Specific logic to query Stripe's status server
        return "Stripe Status: PAID";
    }
}

