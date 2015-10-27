import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
  
  @Test
  public void testAddPositive() {
    Calculator c = new Calculator();
    assertTrue(c.add(4, 9) == 13);
  }

  @Test
  public void testAddFailing() {
    Calculator c = new Calculator();
    assertTrue(c.add(2, 2) == 5);
  }
  
}
