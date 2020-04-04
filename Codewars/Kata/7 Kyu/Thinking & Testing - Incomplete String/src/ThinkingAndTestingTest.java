import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThinkingAndTestingTest {

  @Test
  public void exampleTests1() {
    // return s?
    assertEquals("", ThinkingAndTesting.testIncompleteString(""));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("a"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("b"));
  }
  
  @Test
  public void exampleTests2() {
    // return s.substring(0, 1) ?
    assertEquals("a", ThinkingAndTesting.testIncompleteString("aa"));
    assertEquals("a", ThinkingAndTesting.testIncompleteString("ab"));
    assertEquals("b", ThinkingAndTesting.testIncompleteString("bc"));
  }
  
  @Test
  public void exampleTests3() {
    // return s.substring(0, s.length() / 2) ?
    assertEquals("aa", ThinkingAndTesting.testIncompleteString("aaaa"));
    assertEquals("aaa", ThinkingAndTesting.testIncompleteString("aaaaaa"));
  }
}