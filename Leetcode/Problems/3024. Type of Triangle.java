/*
Problem     : Type of Triangle
Difficulty  : Easy
URL         : https://leetcode.com/problems/type-of-triangle/
*/

class Solution {
    public String triangleType(int[] nums) {
         if (nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) 
            return "none";
        else if (nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2])
            return "equilateral";
        else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2])
            return "scalene";
        
        return "isosceles";
    }
}

/*
Runtime: 0 ms, faster than 100% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 42.34 MB, less than 10.56% of Java online submissions for Median of Two Sorted Arrays.
*/