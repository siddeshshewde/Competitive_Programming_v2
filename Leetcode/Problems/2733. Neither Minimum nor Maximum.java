/*
Problem     : Neither Minimum nor Maximum
Difficulty  : Easy
URL         : https://leetcode.com/problems/neither-minimum-nor-maximum/
*/

class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < nums.length ; i++)
        {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] != min && nums[i] != max)
            {
                return nums[i];
            }
        }
        return -1;
    }
}

/*
Runtime: 4 ms, faster than 99.58% of Java online submissions for Neither Minimum nor Maximum.
Memory Usage: 44.67 MB, less than 86.24% of Java online submissions for Neither Minimum nor Maximum.
*/