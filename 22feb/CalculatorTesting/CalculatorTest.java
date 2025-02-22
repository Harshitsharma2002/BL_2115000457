import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "Addition test failed");
        assertEquals(0, calculator.add(0, 0), "Addition test failed");
        assertEquals(-1, calculator.add(2, -3), "Addition test failed");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "Subtraction test failed");
        assertEquals(-5, calculator.subtract(-3, 2), "Subtraction test failed");
        assertEquals(0, calculator.subtract(0, 0), "Subtraction test failed");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "Multiplication test failed");
        assertEquals(0, calculator.multiply(0, 5), "Multiplication test failed");
        assertEquals(-6, calculator.multiply(-2, 3), "Multiplication test failed");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001, "Division test failed");
        assertEquals(-2.0, calculator.divide(-6, 3), 0.001, "Division test failed");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Division by zero test failed");
    }
}
