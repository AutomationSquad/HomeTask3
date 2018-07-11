package tests;

import calculator.Calculator;
import listeners.TestListener;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestListener.class)
class CalculatorTest {
    private Calculator calc = new Calculator();

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(2, 4),
                Arguments.of(3, 8),
                Arguments.of(50, 11),
                Arguments.of(42, 2),
                Arguments.of(2, 12)
        );
    }


    @ParameterizedTest
    @MethodSource("params")
    void addTest(int first, int second) {
        System.out.println("Test of the add feature. Parameters: " + second + ", " + first);
        assertEquals(second + first, calc.add(second, first), "The sum feature doesn't work correctly with the parameters: " + second + ", "+ first);
    }

    @ParameterizedTest
    @MethodSource("params")
    void subtractTest(int first, int second) {
        System.out.println("Test of the subtract feature. Parameters: " + second + ", " + first);
        assertEquals(second - first, calc.subtract(second, first), "The subtract feature doesn't work correctly with the parameters: " + second + ", "+ first);
    }

    @ParameterizedTest
    @MethodSource("params")
    void multiplyTest(int first, int second) {
        System.out.println("Test of the multiply feature. Parameters: " + second + ", " + first);
        assertEquals(second * first, calc.multiply(second, first), "The multiply feature doesn't work correctly with the parameters: " + second + ", "+ first);
    }

    @ParameterizedTest
    @MethodSource("params")
    void divideTest(int first, int second) {
        System.out.println("Test of the divide feature. Parameters: " + second + ", " + first);
        assertEquals(second / first, calc.divide(second, first), "The divide feature doesn't work correctly with the parameters: " + second + ", "+ first);
    }
}
