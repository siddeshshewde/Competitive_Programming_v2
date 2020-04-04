import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class KeypadTest {
    private static class KnownKeypad {
      private static final String[] KEYS = new String[] {
        "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"
      };
      
      private static int lookup(char c) {
        for (String key : KEYS) {
          for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == c) {
              return i + 1;
            }
          }
        }
        return 0;
      }
      
      public static int presses(String phrase) {
        int result = 0;
        phrase = phrase.toUpperCase();
        for (char c : phrase.toCharArray()) {
          // System.out.println("c: " + c);
          result += lookup(c);
        }
        return result;
      }
    }
    

    @Test
    public void examples() {
      assertEquals(9, Keypad.presses("LOL"));
      assertEquals(13, Keypad.presses("HOW R U"));
    }

    @Test
    public void numericInputs() {
      assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }

    @Test
    public void caseInsensitive() {
      assertEquals(9, Keypad.presses("lol"));
    }

    @Test
    public void singleDigits() {
      assertEquals(2, Keypad.presses("0"));
      assertEquals(1, Keypad.presses("1"));
    }

    @Test
    public void specialCharacters() {
      assertEquals(2, Keypad.presses("#*"));
    }


    @Test
    public void punctuation() {
      assertEquals(1, Keypad.presses("A,!£$@:"));
    }

    @Test
    public void randomStrings() {
      Random rand = new Random();
      String letters = "ABCDEFGHIJKLOMNOPQRSTUVWXYZabcdefghijklminopqrstuvwxy#*,!:@'$";
      for (int i = 0; i < 40; i++) {
        int len = rand.nextInt(25) + 6;
        StringBuilder buff = new StringBuilder();
        for (int j = 0; j < len; j++) {
          buff.append(letters.charAt(rand.nextInt(letters.length())));
        }
        String testing = buff.toString();
        int expected = KnownKeypad.presses(testing);
        int actual = Keypad.presses(testing);
        assertEquals(
          "presses(\"" + testing + "\")",
          expected, 
          actual);
      }
    }
}
