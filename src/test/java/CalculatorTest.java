import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
  
  @Test
  public void testAddPositive() {
    Calculator c = new Calculator();
    assertTrue(c.add(4, 9) == 13);
  }

  @Test
  public void testSubtract() {
    Calculator c = new Calculator();
    assertTrue(c.subtract(7, 4) == 3);
  }


  @Test
  public void testMultiply() {
    Calculator c = new Calculator();
    assertTrue(c.multiply(3, 4) == 12);
  }

}
