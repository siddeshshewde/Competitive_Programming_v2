import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
  @Test
  public void evenTests() {
    assertEquals("es", Kata.getMiddle("test"));
    assertEquals("dd", Kata.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", Kata.getMiddle("testing"));
    assertEquals("A", Kata.getMiddle("A"));
  }
}