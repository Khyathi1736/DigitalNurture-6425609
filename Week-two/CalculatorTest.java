import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void clear() {
        System.out.println("Calculator cleared");
    }
}

// Test class
public class CalculatorTest {

    @Test
    void testAddWithMock() {
        //create mock
        Calculator mockCalc = mock(Calculator.class);

        // Stubbing: define behavior
        when(mockCalc.add(2, 3)).thenReturn(10); // fake return value

        // Act: call method
        int result = mockCalc.add(2, 3);

        // Assert: check stubbed value
        assertEquals(10, result);

        // Verify: method was called
        verify(mockCalc).add(2, 3);
    }

    @Test
    void testMultiplyWithMock() {
        Calculator mockCalc = mock(Calculator.class);
        when(mockCalc.multiply(2, 5)).thenReturn(20);

        int result = mockCalc.multiply(2, 5);

        assertEquals(20, result);
        verify(mockCalc).multiply(2, 5);
    }

}
