/*
Problem  : Search Insert Position
Link     : https://leetcode.com/problems/search-insert-position/
*/


class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(;i<nums.length;i++)
        {                
            if(nums[i]==target)
                return i;
            if(nums[i] > target)
                break;
        }
        return i;
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 43.8 MB, less than 28.99% of Java online submissions for Search Insert Position.
*/