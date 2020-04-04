import org.junit.Test;
import java.util.Arrays; 
import static org.junit.Assert.assertEquals;

public class WalkTest {
  private static final char[][] fail = new char[][] {
    new char[] {'n'},
    new char[] {'n', 's'},
    new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'},
    new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'},
    new char[] {'n','s','n','s','n','s','n','s','n','n'},
    new char[] {'e','e','e','w','n','s','n','s','e','w'},
    new char[] {'n','e','n','e','n','e','n','e','n','e'},
    new char[] {'n','w','n','w','n','w','n','w','n','w'},
    new char[] {'s','e','s','e','s','e','s','e','s','e'},
    new char[] {'s','w','s','w','s','w','s','w','s','w'}
  };
  
  private static final char[][] pass = new char[][] {
    new char[] {'n','s','n','s','n','s','n','s','n','s'},
    new char[] {'e','w','e','w','n','s','n','s','e','w'},
    new char[] {'n','s','e','w','n','s','e','w','n','s'}
  };
 
  @Test
  public void Test() {
    assertEquals("Should return false if walk is too short.  ", false, TenMinWalk.isValid(fail[0]));
    assertEquals("Should return false if walk is too short.  ", false, TenMinWalk.isValid(fail[1]));
    assertEquals("Should return false if walk is too long.  ", false, TenMinWalk.isValid(fail[2]));
    assertEquals("Should return false if walk is too long.  ", false, TenMinWalk.isValid(fail[3]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[4]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[5]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[6]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[7]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[8]));
    assertEquals("Should return false if walk does not bring you back to start.  ", false, TenMinWalk.isValid(fail[9]));
    assertEquals("Should return true for a valid walk.  ", true, TenMinWalk.isValid(pass[0]));
    assertEquals("Should return true for a valid walk.  ", true, TenMinWalk.isValid(pass[1]));
    assertEquals("Should return true for a valid walk.  ", true, TenMinWalk.isValid(pass[2]));
    
    //Additional tests
    
    int[] v = { 1, -1, 10, -10 };
    char[] dirs = { 'e', 'w', 'n', 's' };
    int[] c = new int[10];
    for (c[0] = 0; c[0] < 4; c[0]++)
    for (c[1] = 0; c[1] < 4; c[1]++)
    for (c[2] = 0; c[2] < 4; c[2]++)
    for (c[3] = 0; c[3] < 4; c[3]++)
    for (c[4] = 0; c[4] < 4; c[4]++)
    for (c[5] = 0; c[5] < 4; c[5]++)
    for (c[6] = 0; c[6] < 4; c[6]++)
    for (c[7] = 0; c[7] < 4; c[7]++)
    for (c[8] = 0; c[8] < 4; c[8]++)
    for (c[9] = 0; c[9] < 4; c[9]++) {
      boolean valid = Arrays.stream(c).map(i -> v[i]).sum() == 0;
      char[] walk = new char[10];
      for (int i = 0; i < 10; ++i) walk[i] = dirs[c[i]];
      assertEquals(valid, TenMinWalk.isValid(walk));
    }
  }
}
