import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.*;

public class SolutionTest {

  @Test
  public void BasicTests() {
    assertEquals("1", Kata.Factorial(1));
    assertEquals("120", Kata.Factorial(5));
    assertEquals("362880", Kata.Factorial(9));
    assertEquals("1307674368000", Kata.Factorial(15));
  }

  @Test
  public void ExtendedTests() {
    assertEquals("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000", Kata.Factorial(100));
    assertEquals("57133839564458545904789328652610540031895535786011264182548375833179829124845398393126574488675311145377107878746854204162666250198684504466355949195922066574942592095735778929325357290444962472405416790722118445437122269675520000000000000000000000000000000000000", Kata.Factorial(150));
    assertEquals("788657867364790503552363213932185062295135977687173263294742533244359449963403342920304284011984623904177212138919638830257642790242637105061926624952829931113462857270763317237396988943922445621451664240254033291864131227428294853277524242407573903240321257405579568660226031904170324062351700858796178922222789623703897374720000000000000000000000000000000000000000000000000", Kata.Factorial(200));
    assertEquals("3232856260909107732320814552024368470994843717673780666747942427112823747555111209488817915371028199450928507353189432926730931712808990822791030279071281921676527240189264733218041186261006832925365133678939089569935713530175040513178760077247933065402339006164825552248819436572586057399222641254832982204849137721776650641276858807153128978777672951913990844377478702589172973255150283241787320658188482062478582659808848825548800000000000000000000000000000000000000000000000000000000000000", Kata.Factorial(250));
  }

  @Test
  public void RandomTests() {

    for (int i = 0; i < 10; i++) {
      int a = getRandom(0, 10);
      String expected = getQwerty(a);
      assertEquals(a + "!", expected, Kata.Factorial(a));
    }

    for (int i = 0; i < 10; i++) {
      int a = getRandom(0, 80) + 100;
      String expected = getQwerty(a);
      assertEquals(a + "!", expected, Kata.Factorial(a));
    }

  }

  private int getRandom(int min, int max) {
    Random random = new Random();
    return random.nextInt((max - min) + 1) + min;
  }

  private String getQwerty(int n) {
    List<Integer> res = new ArrayList<>();
    res.add(1);
    for (int i = 2; i <= n; ++i) {
      int c = 0;
      for (int j = 0; j < res.size() || c != 0; j++) {
        c += (j < res.size() ? res.get(j) : 0) * i;
        if (res.size() <= j) {
          res.add(c % 10);
        } else {
          res.set(j, c % 10);
        }
        c = c / 10;
      }
    }
    Collections.reverse(res);
    int[] intArray = Arrays.stream(res.toArray(new Integer[res.size()])).mapToInt(Integer::intValue).toArray();
    return arrayToString(intArray);
  }

  private static String arrayToString(int array[]) {
    StringBuilder builder = new StringBuilder();
    for (int i : array) {
      builder.append(i);
    }
    return builder.toString();
  }

}
