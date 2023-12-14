import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(4, 3), "4 - 3 should equal 1");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }
}
