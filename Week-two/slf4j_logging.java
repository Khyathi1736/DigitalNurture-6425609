import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

    public void processPayment(double amount) {
        logger.info("Processing payment of amount: {}", amount);

        if (amount <= 0) {
            logger.warn("Invalid payment amount: {}", amount);
        } else {
            try {
                // Simulate payment processing
                int result = 100 / (int) amount;  // Just for demo
                logger.info("Payment processed successfully. Result: {}", result);
            } catch (Exception e) {
                logger.error("Error occurred while processing payment", e);
            }
        }
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment(0);     // Will log warning
        service.processPayment(50);    // Will log info
        service.processPayment(-10);   // Will log warning
    }
}
