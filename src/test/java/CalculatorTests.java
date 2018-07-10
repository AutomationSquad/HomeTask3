import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CalculatorTests {

    private int operand1, operand2;
    private long testStart, testEnd;
    private Calculator calculator = new Calculator();


    public CalculatorTests(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Parameters
    public static Collection<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {2, 4}, {3, 8}, {50, 11}, {42, 2}, {2, 12}
        });
    }

    @Before
    public void initStart() {
        testStart = System.currentTimeMillis();
    }

    @After
    public void countExecutionTime() {
        testEnd = System.currentTimeMillis();
        System.out.println("Test was running for " + (testEnd - testStart) + " ms");
    }

    @Test
    public void testAdd() {
        int o1 = operand1;
        int o2 = operand2;
        int exp = o1 + o2;
        Assert.assertEquals(calculator.add(o1, o2), exp);  //можно ведь все запихнуть сюда? несколько expected, и несколько assert
    }

    @Test
    public void testSub() {
        int o1 = operand1;
        int o2 = operand2;
        int exp = o1 - o2;
        Assert.assertEquals(calculator.substract(o1, o2), exp);
    }

    @Test
    public void testMultiply() {
        int o1 = operand1;
        int o2 = operand2;
        int exp = o1 * o2;
        Assert.assertEquals(calculator.multiply(o1, o2), exp);
    }

    @Test
    public void testDivide() {
        int o1 = operand1;
        int o2 = operand2;
        int exp = o1 / o2;
        Assert.assertEquals(calculator.divide(o1, o2), exp);
    }

}
