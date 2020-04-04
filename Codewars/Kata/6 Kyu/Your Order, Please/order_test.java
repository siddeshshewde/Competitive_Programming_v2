import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class OrderTest {
  @Test
  public void test1() {
    assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
  }
  
  @Test
  public void test2() {
    assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
  }
  
  @Test
  public void test3() {
    assertThat(Order.order("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"), equalTo("wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor"));
  }
  
  @Test
  public void test4() {
    assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
  }
  
  @Test
  public void test5() {
    assertThat(Order.order("3 6 4 2 8 7 5 1 9"), equalTo("1 2 3 4 5 6 7 8 9"));
  }
}
