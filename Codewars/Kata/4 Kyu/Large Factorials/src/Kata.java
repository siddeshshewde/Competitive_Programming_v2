import java.math.BigInteger;
public class Kata
{

  public static String Factorial(int n) {
    if (n < 0)
        return null;
    BigInteger x = new BigInteger("1");
    for (int i = 1 ; i <= n ; i++)
    {
        x = x.multiply(new BigInteger("" +i));
    }
    return x.toString();
  }

}