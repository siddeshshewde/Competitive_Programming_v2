import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class SumSquaredDivisorsTest {

  private static long[] solAux(long n) {
      long s = 0;
      long nf = 0;
      long[] res = new long[2];
      for (long i = 1; i <= Math.floor(Math.sqrt(n)); i += 1) {
          if (n % i == 0) {
              s += i * i;
              nf = n / i;
              if (nf != i)
                  s += nf * nf;
        }
    }
      if (Math.pow((long)Math.sqrt(s), 2) == s) {
          res[0] = n;
          res[1] = s;
          return res;
      } else return null;
  }
  public static String solution(long m, long n) {
    String res = "[";
      for (long i = m; i <= n; i++) {
          long[] r = solAux(i);
          if (r != null) {
              res += "[" + Long.toString(r[0]) + ", " + Long.toString(r[1]) + "], ";
          }
      }
      return res.replaceFirst(",\\s$", "") + "]";
  }

  @Test
  public void test1() {
    assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
  }
  @Test
  public void test2() {
    assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
  }
  @Test
  public void test3() {
    assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
  }
  @Test
  public void test4() {
    assertEquals("[]", SumSquaredDivisors.listSquared(300, 600));
  }
  @Test
  public void test5() {
    assertEquals("[[728, 722500], [1434, 2856100]]", SumSquaredDivisors.listSquared(600, 1500));
  }
  @Test
  public void test6() {
    assertEquals("[[1673, 2856100]]", SumSquaredDivisors.listSquared(1500, 1800));
  }
  @Test
  public void test7() {
    assertEquals("[[1880, 4884100]]", SumSquaredDivisors.listSquared(1800, 2000));
  }
  @Test
  public void test8() {
    assertEquals("[]", SumSquaredDivisors.listSquared(2000, 2200));
  }
  @Test
  public void test9() {
    assertEquals("[[4264, 24304900]]", SumSquaredDivisors.listSquared(2200, 5000));
  }
  @Test
  public void test10() {
    assertEquals("[[6237, 45024100], [9799, 96079204], [9855, 113635600]]", SumSquaredDivisors.listSquared(5000, 10000));
  }
  
  @Test
  public void testA() {
    System.out.println("****** Random test ******");
    Random rnd = new Random();
    for (int i = 0; i < 20; i++) {    
      int m = Math.round(rnd.nextInt(25) * (42 - 2) + 200);
      int n = Math.round(rnd.nextInt(125) * (42 - 2) + 1100);
            System.out.println("listSquared m: " + m + " n: " + n);
            assertEquals(SumSquaredDivisorsTest.solution(m, n), SumSquaredDivisors.listSquared(m, n));
    }
  }
  
}