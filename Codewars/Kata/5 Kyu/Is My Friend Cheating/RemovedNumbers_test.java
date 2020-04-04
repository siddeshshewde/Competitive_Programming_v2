import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import java.util.Random;


public class RemovedNumbersTest {

  public void compare(List<long[]> r1, List<long[]> r2, long n) {
    assertTrue("Arrays not the same length", r1.size() == r2.size());
    for (int i = 0; i < r1.size(); i++) {
      long[] a1 = r1.get(i);
      long[] a2 = r2.get(i);
      assertArrayEquals("Number n was " + n, a1, a2);
    }
  }
  
  public static List<long[]> removNbTest(long n) {
    long s = (long)(n * (n +1) / 2.0);
    List<long[]> res = new ArrayList<long[]>();
    long i = (long)(n / 2);
    while (i <= n) {
      long b = (long)(s - i);
      if (b % (i + 1) == 0) {
        long[] c = new long[] {i, (long)(b / (i + 1))};
        res.add(c);
      }
      i += 1;
    }
    return res;
  }
  
  @Test
  public void test1() {
    compare(RemovedNumbersTest.removNbTest(26), RemovedNumbers.removNb(26), 26);
  }
  @Test
  public void test2() {
    compare(RemovedNumbersTest.removNbTest(100), RemovedNumbers.removNb(100), 100);
  }
  @Test
  public void test3() {
    compare(RemovedNumbersTest.removNbTest(101), RemovedNumbers.removNb(101), 101);
  }
  @Test
  public void test4() {
    compare(RemovedNumbersTest.removNbTest(102), RemovedNumbers.removNb(102), 102);
  }
  @Test
  public void test5() {
    compare(RemovedNumbersTest.removNbTest(110), RemovedNumbers.removNb(110), 110);
  }
  @Test
  public void test6() {
    compare(RemovedNumbersTest.removNbTest(1006), RemovedNumbers.removNb(1006), 1006);
  }
  @Test
  public void test7() {
    compare(RemovedNumbersTest.removNbTest(103), RemovedNumbers.removNb(103), 103);
  }
  @Test
  public void test8() {
    compare(RemovedNumbersTest.removNbTest(446), RemovedNumbers.removNb(446), 446);
  }
  @Test
  public void test9() {
    compare(RemovedNumbersTest.removNbTest(846), RemovedNumbers.removNb(846), 846);
  }
  @Test
  public void test10() {
    compare(RemovedNumbersTest.removNbTest(1000003), RemovedNumbers.removNb(1000003), 1000003);
  }
  @Test
  public void test11() {
    compare(RemovedNumbersTest.removNbTest(1000008), RemovedNumbers.removNb(1000008), 1000008);
  }
  
  @Test
  public void test() {
    Random rnd = new Random();
    long[] someVals = new long[] {
        210, 211, 213, 220, 226, 231, 232, 249, 250, 257, 262, 
                263, 265, 266, 282, 290, 297, 300, 304, 311, 312, 314, 
                325, 340, 341, 346, 358, 362, 369, 378, 381, 386, 394};
    for (int i = 0; i < 10; i++) {
      int rn = rnd.nextInt(29);
      long f1 = someVals[rn]; 
      System.out.println("Random test " + i);
      compare(RemovedNumbersTest.removNbTest(f1), RemovedNumbers.removNb(f1), f1);
    }
    
  }
  
}