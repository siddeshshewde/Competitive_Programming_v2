public class ThinkingAndTesting {

  public static String testIncompleteString(String s) {
    String result = "";
    int i = 0;
    while ( i < s.length() )
    {
        if (i+1 < s.length())
            result = result + (char)((s.charAt(i) + s.charAt(i+1)) / 2);
        else
          result = result + s.charAt(i);
        i = i + 2;
    }
    return result;
  }
}