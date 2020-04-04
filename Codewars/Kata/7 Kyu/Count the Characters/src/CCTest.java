import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(CC.charCount("fizzbuzz", 'z'), 4);
    assertEquals(CC.charCount("FIZZBUZZ", 'z'), 4);
  }
}