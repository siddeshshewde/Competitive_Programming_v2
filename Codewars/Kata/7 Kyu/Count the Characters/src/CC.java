public class CC {
  public static int charCount(String str, char c) {
    int count = 0;
    for (int i = 0 ; i < str.length() ; i++)
    {
      if (str.toLowerCase().charAt(i) == Character.toLowerCase(c))
      {
          count++;
      }
    }
    return count;
  }
}