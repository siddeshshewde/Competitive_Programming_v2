/*
Title:
    Integers: Recreation One

Kata:
    https://www.codewars.com/kata/55aa075506463dac6600010d/train/java

Description:
    Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared divisors is 2500 which is 50 * 50, a square!

    Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is itself a square. 42 is such a number.

    The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having two elements, first the number whose squared divisors is a square and then the sum of the squared divisors.

Example:
    list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
    list_squared(42, 250) --> [[42, 2500], [246, 84100]]
    
    The form of the examples may change according to the language, see Example Tests: for more details.

*/

import java.util.Arrays;
import java.util.Vector;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        Vector result = new Vector();
        for (long i = m; i <= n; i++) {
            Vector vector = new Vector();
            for (long j = 1; j <= m; j++) {
                if (m % j == 0) {
                    vector.addElement(j * j);
                }
            }
            long sum = 0;
            for (int j = 0; j < vector.size(); j++) {
                sum = sum + (long) vector.get(j);
            }
            if(Math.sqrt(sum) -(int)Math.sqrt(sum) == 0){
                long[] item = new long[]{m,sum};
                result.addElement(Arrays.toString(item));
            }
            m++;
        }
        return Arrays.toString(result.toArray());
    }

    public static void main(String[] args) {
        SumSquaredDivisors sumSquaredDivisors = new SumSquaredDivisors();
        System.out.println(sumSquaredDivisors.listSquared(1,10000));
    }
}