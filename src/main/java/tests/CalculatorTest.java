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
public class CalculatorTest {
    Calculator calc = new Calculator();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(2,4,3,8,50,11,42,2,2,12)
        );
    }


    @ParameterizedTest
    @MethodSource("params")
    void addTest(int first, int second, int third, int forth, int fifth, int sixth, int seventh, int eighth, int ninth, int tenth ){
        System.out.println("Test#1 of the add feature. Parameters: " + second + ", " + first);
        assertEquals(second+first, calc.add(second, first));
        System.out.println("Test#2 of the add feature. Parameters: " + forth + ", " + third);
        assertEquals(forth+third, calc.add(forth,third));
        System.out.println("Test#3 of the add feature. Parameters: " + sixth + ", " + fifth);
        assertEquals(sixth+fifth, calc.add(sixth, fifth));
        System.out.println("Test#4 of the add feature. Parameters: " + eighth + ", " + seventh);
        assertEquals(eighth+seventh, calc.add(eighth,seventh));
        System.out.println("Test#5 of the add feature. Parameters: " + tenth + ", " + ninth);
        assertEquals(tenth+ninth, calc.add(tenth,ninth));


    }

    @ParameterizedTest
    @MethodSource("params")
    void subtractTest(int first, int second, int third, int forth, int fifth, int sixth, int seventh, int eighth, int ninth, int tenth ){
        System.out.println("Test#1 of the subtract feature. Parameters: " + second + ", " + first);
        assertEquals(second-first, calc.subtract(second, first));
        System.out.println("Test#2 of the subtract feature. Parameters: " + forth + ", " + third);
        assertEquals(forth-third, calc.subtract(forth,third));
        System.out.println("Test#3 of the subtract feature. Parameters: " + sixth + ", " + fifth);
        assertEquals(sixth-fifth, calc.subtract(sixth, fifth));
        System.out.println("Test#4 of the subtract feature. Parameters: " + eighth + ", " + seventh);
        assertEquals(eighth-seventh, calc.subtract(eighth,seventh));
        System.out.println("Test#5 of the subtract feature. Parameters: " + tenth + ", " + ninth);
        assertEquals(tenth-ninth, calc.subtract(tenth,ninth));
    }

    @ParameterizedTest
    @MethodSource("params")
    void multiplyTest(int first, int second, int third, int forth, int fifth, int sixth, int seventh, int eighth, int ninth, int tenth ){
        System.out.println("Test#1 of the multiply feature. Parameters: " + second + ", " + first);
        assertEquals(second*first, calc.multiply(second, first));
        System.out.println("Test#2 of the multiply feature. Parameters: " + forth + ", " + third);
        assertEquals(forth*third, calc.multiply(forth,third));
        System.out.println("Test#3 of the multiply feature. Parameters: " + sixth + ", " + fifth);
        assertEquals(sixth*fifth, calc.multiply(sixth, fifth));
        System.out.println("Test#4 of the multiply feature. Parameters: " + eighth + ", " + seventh);
        assertEquals(eighth*seventh, calc.multiply(eighth,seventh));
        System.out.println("Test#5 of the multiply feature. Parameters: " + tenth + ", " + ninth);
        assertEquals(tenth*ninth, calc.multiply(tenth,ninth));
    }

    @ParameterizedTest
    @MethodSource("params")
    void divideTest(int first, int second, int third, int forth, int fifth, int sixth, int seventh, int eighth, int ninth, int tenth ){
        System.out.println("Test#1 of the divide feature. Parameters: " + second + ", " + first);
        assertEquals(second/first, calc.divide(second, first));
        System.out.println("Test#2 of the divide feature. Parameters: " + forth + ", " + third);
        assertEquals(forth/third, calc.divide(forth,third));
        System.out.println("Test#3 of the divide feature. Parameters: " + sixth + ", " + fifth);
        assertEquals(sixth/fifth, calc.divide(sixth, fifth));
        System.out.println("Test#4 of the divide feature. Parameters: " + eighth + ", " + seventh);
        assertEquals(eighth/seventh, calc.divide(eighth,seventh));
        System.out.println("Test#5 of the divide feature. Parameters: " + tenth + ", " + ninth);
        assertEquals(tenth/ninth, calc.divide(tenth,ninth));
    }
}
