
public class Kata
{
  public static int mod256WithoutMod(int n)
  {
      if (n > 0 && n < 256)
          return n;
      while (n >= 256)
          n = n - 256;
      while (n+256 <= 0)
          n = n + 256;
      return n;
   }
}