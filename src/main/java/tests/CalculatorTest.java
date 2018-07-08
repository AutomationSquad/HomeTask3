package tests;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator c = new Calculator();


  long startTime = System.currentTimeMillis();



  @Test

  public void testAdd() {

    Assert.assertEquals("the result adding is false", 6, c.add(2, 4));
    Assert.assertEquals("the result adding is false", 11, c.add(3, 8));
    Assert.assertEquals("the result adding is false", 61, c.add(50, 11));
    Assert.assertEquals("the result adding is false", 44, c.add(42, 2));
    Assert.assertEquals("the result adding is false", 14, c.add(2, 12));


  }

  @Test

  public void testSubtract() {

    Assert.assertEquals("the result adding is false", -2, c.substract(2, 4));
    Assert.assertEquals("the result adding is false", -5, c.substract(3, 8));
    Assert.assertEquals("the result adding is false", 39, c.substract(50, 11));
    Assert.assertEquals("the result adding is false", 40, c.substract(42, 2));
    Assert.assertEquals("the result adding is false", -10, c.substract(2, 12));


  }

  @Test

  public void testmultiply() {

    Assert.assertEquals("the result adding is false", 8, c.multiply(2, 4));
    Assert.assertEquals("the result adding is false", 24, c.multiply(3, 8));
    Assert.assertEquals("the result adding is false", 550, c.multiply(50, 11));
    Assert.assertEquals("the result adding is false", 84, c.multiply(42, 2));
    Assert.assertEquals("the result adding is false", 24, c.multiply(2, 12));


  }

  @Test

  public void testDivide() {

    Assert.assertEquals("the result adding is false", 2, c.divide(4, 2));
    Assert.assertEquals("the result adding is false", 2, c.divide(8, 3));
    Assert.assertEquals("the result adding is false", 4, c.divide(50, 11));
    Assert.assertEquals("the result adding is false", 21, c.divide(42, 2));
    Assert.assertEquals("the result adding is false", 6, c.divide(12, 2));


  }


  @Test

  public void testNotNull() {

    Assert.assertNotNull("Not null digit", c);


  }

  @Test
  void testDivideZero() {

    try {

      Assert.assertEquals("the result adding is false", 0, c.divide(4, 0));


    } catch (Exception e) {
      System.out.println("It's not allowed operation");

    }


    long endTime = System.currentTimeMillis();
    long diff = endTime - startTime;
    System.out.println("The tests run " + diff + " mc");
  }


}
