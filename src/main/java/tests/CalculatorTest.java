package tests;

import calculator.Calculator;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TestExtension.class)
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2, 4", "3, 8", "50, 11", "42, 2", "2, 12"})
    void canAddCorrect(int first, int second) {

        if (second == 4) {
            System.out.println("Running first test. Verifying Addition. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.add(first, second));
            assertEquals(6, calculator.add(first, second), "Result of the adding is wrong");
        }
        if (second == 8) {
            System.out.println("Running first test. Verifying Addition. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.add(first, second));
            assertEquals(11, calculator.add(first, second), "Result of the adding is wrong");
        }
        if (second == 11) {
            System.out.println("Running first test. Verifying Addition. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.add(first, second));
            assertEquals(61, calculator.add(first, second), "Result of the adding is wrong");
        }
        if (second == 2) {
            System.out.println("Running first test. Verifying Addition. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.add(first, second));
            assertEquals(44, calculator.add(first, second), "Result of the adding is wrong");
        }
        if (second == 12) {
            System.out.println("Running first test. Verifying Addition. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.add(first, second));
            assertEquals(14, calculator.add(first, second), "Result of the adding is wrong");
        }
    }

    @ParameterizedTest
    @CsvSource({"2, 4", "3, 8", "50, 11", "42, 2", "2, 12"})
    void canSubtractCorrect(int first, int second) {
        if (second == 4) {
            System.out.println("Running first test. Verifying Subtraction. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.subtract(first, second));
            assertEquals(-2, calculator.subtract(first, second), "Result of the subtraction is wrong");
        }
        if (second == 8) {
            System.out.println("Running first test. Verifying Subtraction. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.subtract(first, second));
            assertEquals(-5, calculator.subtract(first, second), "Result of the subtraction is wrong");
        }
        if (second == 11) {
            System.out.println("Running first test. Verifying Subtraction. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.subtract(first, second));
            assertEquals(39, calculator.subtract(first, second), "Result of the subtraction is wrong");
        }
        if (second == 2) {
            System.out.println("Running first test. Verifying Subtraction. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.subtract(first, second));
            assertEquals(40, calculator.subtract(first, second), "Result of the subtraction is wrong");
        }
        if (second == 12) {
            System.out.println("Running first test. Verifying Subtraction. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.subtract(first, second));
            assertEquals(-10, calculator.subtract(first, second), "Result of the subtraction is wrong");
        }

    }

    @ParameterizedTest
    @CsvSource({"2, 4", "3, 8", "50, 11", "42, 2", "2, 12"})
    void canMultiplyCorrect(int first, int second) {
        if (second == 4) {
            System.out.println("Running first test. Verifying Multiplication. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.multiply(first, second));
            assertEquals(8, calculator.multiply(first, second), "Result of the multiplication is wrong");
        }
        if (second == 8) {
            System.out.println("Running first test. Verifying Multiplication. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.multiply(first, second));
            assertEquals(24, calculator.multiply(first, second), "Result of the multiplication is wrong");
        }
        if (second == 11) {
            System.out.println("Running first test. Verifying Multiplication. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.multiply(first, second));
            assertEquals(550, calculator.multiply(first, second), "Result of the multiplication is wrong");
        }
        if (second == 2) {
            System.out.println("Running first test. Verifying Multiplication. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.multiply(first, second));
            assertEquals(84, calculator.multiply(first, second), "Result of the multiplication is wrong");
        }
        if (second == 12) {
            System.out.println("Running first test. Verifying Multiplication. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.multiply(first, second));
            assertEquals(24, calculator.multiply(first, second), "Result of the multiplication is wrong");
        }
    }

    @ParameterizedTest
    @CsvSource({"2, 4", "3, 8", "50, 11", "42, 2", "2, 12"})
    void canDivideCorrect(int first, int second) {
        if (second == 4) {
            System.out.println("Running first test. Verifying Division. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.divide(first, second));
            assertEquals(0.5, calculator.divide(first, second), "Result of the division is wrong");
        }
        if (second == 8) {
            System.out.println("Running first test. Verifying Division. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.divide(first, second));
            assertEquals(0.375, calculator.divide(first, second), "Result of the division is wrong");
        }
        if (second == 11) {
            System.out.println("Running first test. Verifying Division. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.divide(first, second));
            assertEquals(4.54, calculator.divide(first, second), "Result of the division is wrong");
        }
        if (second == 2) {
            System.out.println("Running first test. Verifying Division. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.divide(first, second));
            assertEquals(21, calculator.divide(first, second), "Result of the division is wrong");
        }
        if (second == 12) {
            System.out.println("Running first test. Verifying Division. With values:" + first + ", " + second + "." + "\n" + "Result equals: " + calculator.divide(first, second));
            assertEquals(0.16, calculator.divide(first, second), "Result of the division is wrong");
        }

    }
}


