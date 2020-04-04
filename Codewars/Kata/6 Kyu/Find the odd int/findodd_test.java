import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class FindOddTest {
  
  @Test
  public void findTest() {
    Random rng = new Random();
    Random rngLen = new Random();
    int size = rng.nextInt(1000) + 50;
    if (size % 2 == 0) size++;
    
    ArrayList<Integer> list = new ArrayList<Integer>(size);
    for (int i = 0; i < size - 1; i+=2) {
      int even = rng.nextInt(1000);
      list.add(even);
      list.add(even);
    }
    
    int oddMan = rng.nextInt(1000);
   
    list.add(oddMan);
    Collections.shuffle(list);
    int[] randArr = new int[size];
    int j = 0;
    for (int i : list) {
      randArr[j++] = i;
    }
    assertEquals(oddMan, FindOdd.findIt(randArr));
    assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
    assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
    assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    assertEquals(10, FindOdd.findIt(new int[]{10}));
    assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
  }
}
