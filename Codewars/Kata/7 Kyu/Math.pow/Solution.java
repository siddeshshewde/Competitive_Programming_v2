'''
Problem     : Math.pow?
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5dc31e0475b58d0014236a60/train/java
'''

import java.math.BigInteger;
import static java.math.BigInteger.ONE;

public class KidMath {
  public static BigInteger pow(BigInteger a, BigInteger b) {
    if (0 > b.compareTo(ONE)) return new BigInteger("-1");
    for (; 0 < b.compareTo(ONE); b = b.subtract(ONE)) a = a.multiply(a);
    return a;
   }
}