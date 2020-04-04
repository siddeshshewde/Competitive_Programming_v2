import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class JavaTest{  
  @Test
  public final void test_all() {
    Assert.assertEquals( "Nope!" , 4, Java.doubleInteger(2)); // Test cases here!
  }
}