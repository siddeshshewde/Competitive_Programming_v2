//URL         : https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
    
        for(int i: nums){
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}

/* 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
Memory Usage: 73.3 MB, less than 66.58% of Java online submissions for Maximum Subarray.
*/