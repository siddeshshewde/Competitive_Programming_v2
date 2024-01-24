/*
Problem     : Plus One
URL         : https://leetcode.com/problems/plus-one/
*/

class Solution {
    
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
        
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
        
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

/*
Runtime: 0 ms
Beats: 100%
Memory: 41.68 MB
Beats: 45.89%
*/