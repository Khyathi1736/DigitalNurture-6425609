import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testStringEquality() {
        String expected = "hello";
        String actual = "he" + "llo";
        assertEquals(expected, actual);
    }

    @Test
    void testNullValue() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testNotNullValue() {
        String str = "JUnit";
        assertNotNull(str);
    }

    @Test
    void testBooleanCondition() {
        int a = 10, b = 5;
        assertTrue(a > b);
        assertFalse(a < b);
    }
}
