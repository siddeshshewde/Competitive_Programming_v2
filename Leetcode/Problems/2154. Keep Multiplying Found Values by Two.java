/*
Problem     : Keep Multiplying Found Values by Two
Difficulty  : Easy
URL         : https://leetcode.com/problems/keep-multiplying-found-values-by-two/
*/

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int flag = 0;

        while(true)
        {
            flag = 0;
            for (int i = 0 ; i < nums.length ; i++)
            {
                if (original == nums[i])
                {
                    original *= 2;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                break;
            }
        }
        return  original;
    }
}

/*
Runtime: 1 ms, faster than 85.04% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 43.89 MB, less than 81.86% of Java online submissions for Median of Two Sorted Arrays.
*/