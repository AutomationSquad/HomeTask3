package tests;
import calculator.Calculator;
import org.junit.*;
import org.junit.runner.JUnitCore;


public class CalculatorTest {

    private Calculator calc;

    @BeforeClass
     public static void before(){
        System.out.println("Test started..");
    }
    @AfterClass
     public static void after(){
        System.out.println("..test finished.");
    }

    @Before
    public void initTest() {
        calc = new Calculator();
    }

    @After
    public void afterTest() {
        calc = null;
    }

    @Test
    public void testAddPositive() throws Exception {
        Assert.assertEquals("Incorrect result of the summation operation", 6, calc.add(2, 4));
        Assert.assertEquals("Incorrect result of the summation operation", 11, calc.add(3, 8));
        Assert.assertEquals("Incorrect result of the summation operation", 61, calc.add(50, 11));
        Assert.assertEquals("Incorrect result of the summation operation", 44, calc.add(42, 2));
        Assert.assertEquals("Incorrect result of the summation operation", 14, calc.add(2, 12));
     }

    @Test
    public void testAddNegative() throws Exception {
        Assert.assertEquals("Incorrect result of the summation operation", 7, calc.add(2, 4));
        Assert.assertEquals("Incorrect result of the summation operation", 12, calc.add(3, 8));
        Assert.assertEquals("Incorrect result of the summation operation", 62, calc.add(50, 11));
    }

    @Test
    public void testSubstractPositive() throws Exception {
        Assert.assertEquals("Incorrect result of the subtraction operation", -2, calc.substract(2, 4));
        Assert.assertEquals("Incorrect result of the subtraction operation", -5, calc.substract(3, 8));
        Assert.assertEquals("Incorrect result of the subtraction operation", 39, calc.substract(50, 11));
        Assert.assertEquals("Incorrect result of the subtraction operation", 40, calc.substract(42, 2));
        Assert.assertEquals("Incorrect result of the subtraction operation", -10, calc.substract(2, 12));
    }

    @Test
    public void testSubstractNegative() throws Exception {
        Assert.assertEquals("Incorrect result of the subtraction operation", -3, calc.substract(2, 4));
        Assert.assertEquals("Incorrect result of the subtraction operation", -4, calc.substract(3, 8));
        Assert.assertEquals("Incorrect result of the subtraction operation", 37, calc.substract(50, 11));
    }

    @Test
    public void testMultiplyPositive() throws Exception {
        Assert.assertEquals("Incorrect result of the multiplication operation", 8, calc.multiply(2, 4));
        Assert.assertEquals("Incorrect result of the multiplication operation", 24, calc.multiply(3, 8));
        Assert.assertEquals("Incorrect result of the multiplication operation", 550, calc.multiply(50, 11));
        Assert.assertEquals("Incorrect result of the multiplication operation", 84, calc.multiply(42, 2));
        Assert.assertEquals("Incorrect result of the multiplication operation", 24, calc.multiply(2, 12));
    }

    @Test
    public void testMultiplyNegative() throws Exception {
        Assert.assertEquals("Incorrect result of the multiplication operation", 9, calc.multiply(2, 4));
        Assert.assertEquals("Incorrect result of the multiplication operation", 16, calc.multiply(3, 8));
        Assert.assertEquals("Incorrect result of the multiplication operation", 500, calc.multiply(50, 11));
    }

    @Test
    public void testDividePositive() throws Exception {
        Assert.assertEquals("Incorrect result of the dividing operation", 2, calc.divide(4, 2));
        Assert.assertEquals("Incorrect result of the dividing operation", 2, calc.divide(8, 3));
        Assert.assertEquals("Incorrect result of the dividing operation", 4, calc.divide(50, 11));
        Assert.assertEquals("Incorrect result of the dividing operation", 21, calc.divide(42, 2));
        Assert.assertEquals("Incorrect result of the dividing operation", 6, calc.divide(12, 2));
    }

    @Test
    public void testDivideNegative() throws Exception {
        Assert.assertEquals("Incorrect result of the dividing operation", 2, calc.divide(4, 2));
        Assert.assertEquals("Incorrect result of the dividing operation", 3, calc.divide(8, 3));
        Assert.assertEquals("Incorrect result of the dividing operation", 5, calc.divide(50, 11));
    }

    public static void main(String args[]){
        JUnitCore core = new JUnitCore();
        core.addListener(new Listener());
        core.run(CalculatorTest.class);
    }


}
