import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

interface UserService {
    String getUserRole(String username);
}

class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String fetchUserRole(String username) {
        return userService.getUserRole(username);
    }
}

public class UserControllerTest {

    @Test
    void testFetchUserRole() {
        // Arrange (Mocking)
        UserService mockService = mock(UserService.class);
        when(mockService.getUserRole("admin")).thenReturn("Administrator");

        UserController controller = new UserController(mockService);

        // Act
        String role = controller.fetchUserRole("admin");

        // Assert
        assertEquals("Administrator", role);
    }
}
