/*
Problem     : Single Number
URL         : https://leetcode.com/problems/single-number/
*/

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length-1 ; i = i+2)
        {
            if (nums[i] != nums[i+1])
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

/*
Runtime: 7 ms
Beats: 33.85%
Memory: 45.78 MB
Beats: 47.18%
*/