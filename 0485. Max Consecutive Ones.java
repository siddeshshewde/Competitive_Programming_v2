/*
Problem     : Max Consecutive Ones
URL         : https://leetcode.com/problems/max-consecutive-ones/
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] == 1)
            {
                sum++;
            }
            else
            {
                if (sum > max)
                {
                    max = sum;
                }
                sum = 0;
            }
        }
        if (sum > max)
        {
            return sum;
        }
        return max;
    }
}

/*
Runtime: 2 ms
Beats: 88.74%
Memory: 45.72 MB
Beats: 17.01%
*/