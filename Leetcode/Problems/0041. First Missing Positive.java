/*
Problem     :   
Difficulty  : Hard
URL         : https://leetcode.com/problems/first-missing-positive
*/

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int flag = 0;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] > 1 && flag == 0)
                return 1;
            if (nums[i] < 1)
                continue;
            else if (nums[i] == counter)
            {
                flag = 1;
                counter++;
            }
        }
        return counter;
    }
}

/*
Runtime: 15 ms, faster than 9.79% of Java online submissions for Reverse Integer.
Memory Usage: 56.32 MB, less than 23.95% of Java online submissions for Reverse Integer.
*/