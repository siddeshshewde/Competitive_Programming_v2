import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


public class BouncingBallTest {
  @Test
  public void test0() {
    assertEquals(1, BouncingBall.bouncingBall(2.0, 0.5, 1.0));
  }
  @Test
  public void test1() {
    assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
  }
  @Test
  public void test2() {
    assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
  }
  @Test
  public void test3() {
    assertEquals(21, BouncingBall.bouncingBall(30, 0.75, 1.5));
  }
  @Test
  public void test4() {
    assertEquals(3, BouncingBall.bouncingBall(30, 0.4, 10));
  }
  @Test
  public void test5() {
    assertEquals(3, BouncingBall.bouncingBall(40, 0.4, 10));
  }
  @Test
  public void test6() {
    assertEquals(-1, BouncingBall.bouncingBall(10, 0.6, 10));
  }
  @Test
  public void test7() {
    assertEquals(-1, BouncingBall.bouncingBall(40, 1, 10));
  }
  @Test
  public void test8() {
    assertEquals(-1, BouncingBall.bouncingBall(-5, 0.66, 1.5));
  }
  @Test
  public void test9() {
    assertEquals(-1, BouncingBall.bouncingBall(5, -1, 1.5));
  }
  
  public static int bouncingBallTest(double h, double bounce, double window) {
    if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
      return -1;
    int seen = -1;
    while (h > window) {
          seen += 2;
          h = h * bounce;
    }
      return seen;
    
  }
  @Test
  public void test() {
    Random rnd = new Random();
    double[] someheights = new double[] {12, 10.5, 144, 233, 15.25, 61, 98, 15.9, 25.8, 41.8, 67,
                            109, 17, 28, 46, 7.5, 12.20, 19, 3, 5,
                            83, 13, 21, 35.5, 57, 92, 14,
                            24, 39, 6.5};
    double[] someBounces = new double[] {0.6, 0.6, 0.6, 0.6, 0.6, 1.1, 9, 1, 0.6, 0.6, 0.6,
                          0.75, 0.75, 0.75, 0.75, 0.75, 12.20, 0.75, 0.75,
                          0.83, 0.13, 0.21, 0.35, 0.57, 0.9, 0.14,
                          0.24, 0.39, 0.65, 0.65};
    double[] somewin     = new double[] {1.5, 1.5, 1.44, 2.33, 1, 6.1, 9.8, 1.9, 2.8, 4.8, 3,
                          1.09, 1.7, 2.8, 46, 7.5, 12.20, 1.9, 3, 5,
                          0.83, 1.3, 2.1, 3.5, 0.57, 0.92, 1.4,
                          2.4, 3.9, 6.5};
                         
    for (int k = 0; k < 10; k++) {
      int rn = rnd.nextInt(29);
      double f1 = someheights[rn]; 
      double f2 = someBounces[rn];
      double f3 = somewin[rn];
          System.out.println("Random test " + k);
      assertEquals(BouncingBallTest.bouncingBallTest(f1, f2, f3), BouncingBall.bouncingBall(f1, f2, f3));
    }
  }
  
}
