package tests;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestListener.class)
class CalculatorTest {

    Calculator calculatorObject = new Calculator();

    @DisplayName("Addition operation")
    @ParameterizedTest(name = "{index}: a={0}, b={1}")
    @ArgumentsSource(TestArgumentsProvider.class)
    void addTest(int a, int b) {
        assertEquals(Math.addExact(a, b), calculatorObject.add(a, b));
    }

    @DisplayName("Subtraction operation")
    @ParameterizedTest(name = "{index}: a={0}, b={1}")
    @ArgumentsSource(TestArgumentsProvider.class)
    void subtractTest(int a, int b) {
        assertEquals(Math.subtractExact(a, b), calculatorObject.substract(a, b));
    }

    @DisplayName("Multiplication operation")
    @ParameterizedTest(name = "{index}: a={0}, b={1}")
    @ArgumentsSource(TestArgumentsProvider.class)
    void multiplyTest(int a, int b) {
        assertEquals(Math.multiplyExact(a, b), calculatorObject.multiply(a, b));
    }

    @DisplayName("Division operation")
    @ParameterizedTest(name = "{index}: a={0}, b={1}")
    @ArgumentsSource(TestArgumentsProvider.class)
    void divideTest(int a, int b) {
        assertEquals(Math.floorDiv(a, b), calculatorObject.divide(a, b));
    }


}
