package tests;
import calculator.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

@ExtendWith(Listener.class)
public class CalculatorTest {

    private Calculator calc = new Calculator();

    static Stream<Arguments>params(){
        return Stream.of(
                Arguments.of(2,4),
                Arguments.of(3,8),
                Arguments.of(50,11),
                Arguments.of(42,2),
                Arguments.of(2,12)
        );
    }

   @ParameterizedTest
   @MethodSource("params")
    void testAdd(int first, int second) {
       assertEquals(first+second,calc.add(first,second),"Incorrect result of the summation operation");
    }

    @ParameterizedTest
    @MethodSource("params")
    void testSubstract(int first, int second) {
        assertEquals(first-second,calc.substract(first,second),"Incorrect result of the summation operation");
    }

    @ParameterizedTest
    @MethodSource("params")
    void testMultiply(int first, int second) {
        assertEquals(first*second,calc.multiply(first,second),"Incorrect result of the summation operation");
    }

    @ParameterizedTest
    @MethodSource("params")
    void testDivide(int first, int second) {
        assertEquals(first/second,calc.divide(first,second),"Incorrect result of the summation operation");
    }
}
