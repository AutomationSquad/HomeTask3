package tests;
import calculator.Calculator;
import calculator.Listener;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    static int[][] arguments = new int[][]{{2, 4}, {3, 8}, {50, 11}, {42, 2}, {2, 12}};
    static int[] expectedAdd = new int[]{6, 11, 61, 44, 14};
    static int[] expectedSub = new int[]{-2, -5, 39, 40, -10};
    static int[] expectedMult = new int[]{8, 24, 550, 84, 24};
    static int[] expectedDiv = new int[]{0, 0, 4, 21, 0};
    int i, res;

    @Test
    public void checkAddition() {
        for (i = 0; i < arguments.length; i++) {
            Listener.getTimeBefore();
            res = Calculator.add(arguments[i][0], arguments[i][1]);
            Listener.getTimeAfter();
            Assert.assertEquals(expectedAdd[i], res);
            System.out.println("Addition: "  + arguments[i][0] + " + " + arguments[i][1] + " = " + res + "; delta = " + Listener.getDelta() + ";");
        }
        System.out.println();
    }

    @Test
    public void checkSubstract() {
        for (i = 0; i < arguments.length; i++) {
            Listener.getTimeBefore();
            res = Calculator.substract(arguments[i][0], arguments[i][1]);
            Listener.getTimeAfter();
            Assert.assertEquals(expectedSub[i], res);
            System.out.println("Substraction: " + arguments[i][0] + " - " + arguments[i][1] + " = " + res + "; delta = " + Listener.getDelta() + ";");
        }
        System.out.println();
    }

    @Test
    public void checkMultiplication() {
        for (i = 0; i < arguments.length; i++) {
            Listener.getTimeBefore();
            res = Calculator.multiply(arguments[i][0], arguments[i][1]);
            Listener.getTimeAfter();
            Assert.assertEquals(expectedMult[i], res);
            System.out.println("Multiplication: " + arguments[i][0] + " * " + arguments[i][1] + " = " + res + "; delta = " + Listener.getDelta() + ";");
        }
        System.out.println();
    }

    @Test
    public void checkDividing() {
        for (i = 0; i < arguments.length; i++) {
            Listener.getTimeBefore();
            res = Calculator.divide(arguments[i][0], arguments[i][1]);
            Listener.getTimeAfter();
            Assert.assertEquals(expectedDiv[i], res);
            System.out.println("Dividing: " + arguments[i][0] + " / " + arguments[i][1] + " = " + res + "; delta = " + Listener.getDelta() + ";");
        }
        System.out.println();
    }
}