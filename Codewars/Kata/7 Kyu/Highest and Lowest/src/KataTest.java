import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class Tests {
  @Test
  public void Test1() {
    assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
}