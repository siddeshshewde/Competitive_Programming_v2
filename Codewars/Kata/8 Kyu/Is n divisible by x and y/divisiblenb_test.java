import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DivisibleNbTests {

  @Test
  public void test1() {
    assertEquals(true, DivisibleNb.isDivisible(12,4,3));
  }
  @Test
  public void test2() {
    assertEquals(false, DivisibleNb.isDivisible(3,3,4));
  }
  @Test
  public void test3() {
    assertEquals(false, DivisibleNb.isDivisible(8,3,4));
  }
  @Test
  public void test4() {
    assertEquals(true, DivisibleNb.isDivisible(48,3,4));
  }
  @Test
  public void test5() {
    assertEquals(true, DivisibleNb.isDivisible(100,5,10));
  }
  @Test
  public void test6() {
    assertEquals(false, DivisibleNb.isDivisible(100,5,3));
  } 
  @Test
  public void test7() {
    assertEquals(true, DivisibleNb.isDivisible(4,4,2));
  } 
  @Test
  public void test8() {
    assertEquals(false, DivisibleNb.isDivisible(5,2,3));
  } 
  @Test
  public void test9() {
    assertEquals(true, DivisibleNb.isDivisible(1000000,1000000,1000000));
  } 
  @Test
  public void test10() {
    assertEquals(false, DivisibleNb.isDivisible(1,1000000,1000000));
  } 
  @Test
  public void test11() {
    Random rnd = new Random();
    for (int i = 0; i < 50; i++) {      
      long r = rnd.nextLong();
            long n = 100000 * r;
            long k = 100 * r + rnd.nextInt(2);
            long l = 10 * r;
            System.out.println("Divisible n : " + n + " ? by : " + k + " and : " + l);
            assertEquals((n%k == 0) && (n%l == 0), DivisibleNb.isDivisible(n, k, l));
    }
  } 
    
    
}
