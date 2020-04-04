import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
      assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
      assertEquals("0 is a square number (0 * 0)",    true,   Square.isSquare(0));
      assertEquals("3 isn't a square number", false,  Square.isSquare(3));
      assertEquals("4 is a square number (2 * 2)",    true,   Square.isSquare(4));
      assertEquals("25 is a square number (5 * 5)",   true,   Square.isSquare(25));
      assertEquals("26 isn't a square number",false,  Square.isSquare(26));      
    }
    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
      Random rand = new Random();
      for(int i = 0; i < 100; ++i){
        int randomNum = rand.nextInt(0x0fff);
        int randomSq = randomNum * randomNum;
        assertEquals(String.format("%d is a square number (%d * %d)", randomSq, randomSq, randomSq), true, Square.isSquare(randomSq));
      }
    }
    @Test
    public void shouldWorkForRandomNumbers() throws Exception {
      Random rand = new Random();
      for(int i = 0; i < 100; ++i){
        int randomNum = rand.nextInt(0x0fffffff);        
        assertEquals(String.format("Didn't work on %d", randomNum), isSquare(randomNum), Square.isSquare(randomNum));
      }
    }
    private static boolean isSquare(int n) {        
      return n >= 0 && Math.pow(Math.round(Math.sqrt(n)),2) == n;
    }
} 