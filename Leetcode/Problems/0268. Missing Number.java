/*
Problem     : Missing Number
URL         : https://leetcode.com/problems/missing-number/description/
*/

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a = 0;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] == a)
            {
                a++;
            }
        }
        return a;        
    }
}

/*
Runtime: 5 ms
Beats: 29.87%
Memory: 45.21 MB
Beats: 30.96%
*/