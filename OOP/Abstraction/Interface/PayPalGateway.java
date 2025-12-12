package OOP.Abstraction.Interface;

public class PayPalGateway implements PaymentGateway {

    @Override
    public boolean processPayment(double amount, String token) {
        // Specific complex logic to call PayPal's API endpoints
        System.out.println("Initiating PayPal transaction for $" + amount);
        // Simulate API call success/failure
        return true;
    }

    @Override
    public String checkStatus(String transactionId) {
        // Specific logic to query PayPal's status server
        return "PayPal Status: COMPLETED";
    }

    // Can optionally override the default method as well
}

