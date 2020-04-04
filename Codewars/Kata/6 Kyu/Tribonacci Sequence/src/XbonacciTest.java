import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class XbonacciTest {
  private Xbonacci variabonacci;
  
  @Before
  public void setUp() throws Exception {
    variabonacci = new Xbonacci();
  }

  @After
  public void tearDown() throws Exception {
    variabonacci = null;
  }
  
  @Test
  public void basicTests() {
    assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10));
    assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10));
    assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10));    
  }
  
  private void assertArrayEquals(double []expecteds, double[] actuals) {
    for(int i = 0; i < actuals.length; i++)
      assertEquals(expecteds[i], actuals[i], 1e-10);
  }  
}
