import java.util.*;
public class SpinWords {

  public static String spinWords(String sentence) {
        String out = null;
        String[] array = sentence.split(" ");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = array[i].length() >= 5 ? array[i] = new StringBuffer(array[i]).reverse().toString() : array[i];
        }
        out = Arrays.toString(array);
        return out = out.substring(1, out.length() - 1).replaceAll(",", "");
    }
}