package tests;

import calculator.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest implements TestListener {

       @Test
        public void checkAdd () {
        long startTime = System.nanoTime();
        Assert.assertEquals(Calculator.add(2, 4), 6);
        Assert.assertEquals(Calculator.add(3, 8), 11);
        Assert.assertEquals(Calculator.add(50, 11), 61);
        Assert.assertEquals(Calculator.add(42, 2), 44);
        Assert.assertEquals(Calculator.add(2, 12), 14);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
    @Test
    public void checkSubstract () {
        long startTime = System.nanoTime();
        Assert.assertEquals(Calculator.substract(2, 4), -2);
        Assert.assertEquals(Calculator.substract(3, 8), -5);
        Assert.assertEquals(Calculator.substract(50, 11), 39);
        Assert.assertEquals(Calculator.substract(42, 2), 40);
        Assert.assertEquals(Calculator.substract(2, 12), -10);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
    @Test
    public void checkMultiply() {
        long startTime = System.nanoTime();
        Assert.assertEquals(Calculator.multiply(2, 4), 8);
        Assert.assertEquals(Calculator.multiply(3, 8), 24);
        Assert.assertEquals(Calculator.multiply(50, 11), 550);
        Assert.assertEquals(Calculator.multiply(42, 2), 84);
        Assert.assertEquals(Calculator.multiply(2, 12), 24);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
    @Test
    public void checkDivide() {
        long startTime = System.nanoTime();
        Assert.assertEquals(Calculator.divide(4, 2), 2, 0);
        Assert.assertEquals(Calculator.divide(11, 50), 0.22, 0.01);
        Assert.assertEquals(Calculator.divide(42, 2), 21, 0);
        Assert.assertEquals(Calculator.divide(12, 2), 6, 0);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }


}
