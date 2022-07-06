//https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            num.add(nums[i]);
        }
        if (num.size() < nums.length)
        {
            return true;
        }
        return false;
    }
}

/*
Runtime: 29 ms, faster than 12.95% of Java online submissions for Contains Duplicate.
Memory Usage: 71.8 MB, less than 16.51% of Java online submissions for Contains Duplicate.
*/