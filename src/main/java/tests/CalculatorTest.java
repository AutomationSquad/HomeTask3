package tests;

import TestListener.TestExtention;
import calculator.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@ExtendWith(TestExtention.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    static Stream<Arguments> params() {
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
    void testSum(int first, int second) {
        Assert.assertEquals("Sum is wrong", first + second, calculator.add(first, second));
    }

    @ParameterizedTest
    @MethodSource("params")
    void testSubstract(int first, int second) {
        Assert.assertEquals("Substract expected is wrong", first - second, calculator.substract(first, second));
    }

    @ParameterizedTest
    @MethodSource("params")
    void testDivide(int dividend, int divisor) {
        Assert.assertEquals("Expected divide result is wrong", dividend / divisor, calculator.divide(dividend, divisor));
    }

    @ParameterizedTest
    @MethodSource("params")
    void testMultiply(int first, int second) {
        Assert.assertEquals("Expected divide result is wrong", first * second, calculator.multiply(first, second));
    }

}
