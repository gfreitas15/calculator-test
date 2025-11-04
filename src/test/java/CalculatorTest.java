import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.sum(5, 3));
    }
}
