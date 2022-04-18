import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTester {
    @Test
    @DisplayName("2 * 3 = 6")
    void multipliesTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(int expected: 6, calculator.multiply( x: 2, y: 3), message: "2 * 3 should equal 6");
    }

    @Test
    @DisplayName("2 + 3 = 5")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals( expected: 5, calculator.add( x: 2, y: 3), message: "2 + 3 should equal 5");
    }
}