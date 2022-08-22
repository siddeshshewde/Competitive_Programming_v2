/*
Problem  : Subarray Sum Equals K
Link     : https://leetcode.com/problems/subarray-sum-equals-k/
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        for (int i = 0 ; i < nums.length; i++)
        {
            int sum = 0;
            for (int j = i ; j < nums.length ; j++)
            {    
                sum = sum + nums[j];

                if (sum ==k)
                    result++;
            }
        }
        
        return result;
    }
}

/*
Runtime: 2444 ms, faster than 5.00% of Java online submissions for Subarray Sum Equals K.
Memory Usage: 54.9 MB, less than 77.91% of Java online submissions for Subarray Sum Equals K.
*/