/*
Problem     : Odd/Even number of divisors
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/55830eec3e6b6c44ff000040/train/java
*/

import java.math.BigInteger;

public class Oddity {
  public static String oddity(BigInteger n) {
    int count = 0;
    for (BigInteger i = new BigInteger("1") ; i.compareTo(n) <= 0 ; i = i.add(BigInteger.ONE))
    {
      BigInteger result = n.mod(i);
      if (result.signum() == 0)
      {
           count++;
      }
    }
    
    return count%2==0 ? "even" : "odd";
  }
}