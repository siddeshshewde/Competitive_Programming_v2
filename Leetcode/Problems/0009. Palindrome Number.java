/*
Problem     : Palindrome Number
Difficulty  : Easy
URL         : https://leetcode.com/problems/palindrome-number/
*/

class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if (x < 0)
        {
            return false;
        }
        
        int n = 0;
        
        while (x != 0)
        {
            int digit = x % 10;
            n = n * 10 + digit;
            x = x / 10;
        }
        
        return n==y;
    }
}

/*
Runtime: 14 ms, faster than 60.41% of Java online submissions for Palindrome Number.
Memory Usage: 44.6 MB, less than 53.23% of Java online submissions for Palindrome Number.
*/