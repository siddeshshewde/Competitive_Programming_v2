import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void BasicTests() {
      assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));     
    }
}