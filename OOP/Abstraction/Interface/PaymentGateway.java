package OOP.Abstraction.Interface;

public interface PaymentGateway {

    // Constant fields are implicitly public static final
    String API_VERSION = "1.0";

    /**
     * Processes a payment transaction.
     * @param amount The amount to charge.
     * @param token A secure token representing payment details.
     * @return true if successful, false otherwise.
     */
    boolean processPayment(double amount, String token);

    /**
     * Checks the status of a previous transaction.
     * @param transactionId The ID of the transaction.
     * @return A status message.
     */
    String checkStatus(String transactionId);

    // Java 8+ allows default methods with implementations
    default void logTransaction(String id) {
        System.out.println("Logging transaction ID: " + id);
    }
}
