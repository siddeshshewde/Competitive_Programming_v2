// https://leetcode.com/problems/two-sum/submissions/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a,b;
        for(int i=0;i<nums.length-1;i++)
        {
           if(nums[i]+nums[i+1]==target)
            {
               return new int[]{i,i+1};
            }
            else
            {
               i=i+1;
            }
        }
        return new int []{};
    }
}