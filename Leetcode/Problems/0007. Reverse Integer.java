/*
Problem     : Reverse Integer
Difficulty  : Medium
URL         : https://leetcode.com/problems/reverse-integer/
*/

class Solution {
    public int reverse(int x) {
        long result = 0;
        
        while (x != 0)
        {
            result = result * 10 + x % 10;
            x = x / 10;
            
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int)result;
    }
}

/*
Runtime: 1 ms, faster than 99.30% of Java online submissions for Reverse Integer.
Memory Usage: 41.7 MB, less than 13.54% of Java online submissions for Reverse Integer.
*/