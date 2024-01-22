/*
Problem     : Multiple Strings
URL         : https://leetcode.com/problems/multiply-strings/
*/

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return c.toString();
    }
}
/*
Runtime: 10 ms
Beats: 32.94%
Memory: 45.52 MB
Beats: 38.78%
*/