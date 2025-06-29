import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

interface EmailService {
    void sendEmail(String to, String message);
}

class NotificationManager {
    private EmailService emailService;

    public NotificationManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String userEmail) {
        String message = "Welcome to our platform!";
        emailService.sendEmail(userEmail, message);
    }
}

public class NotificationManagerTest {

    @Test
    void testNotifyUserSendsEmail() {
        // Arrange
        EmailService mockEmailService = mock(EmailService.class);
        NotificationManager manager = new NotificationManager(mockEmailService);

        // Act
        manager.notifyUser("user@example.com");

        // Assert - Verifying interaction
        verify(mockEmailService).sendEmail("user@example.com", "Welcome to our platform!");
    }
}
