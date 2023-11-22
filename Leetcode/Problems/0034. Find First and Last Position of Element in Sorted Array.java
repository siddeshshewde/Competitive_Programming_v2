/*
Problem     : Find First and Last Position of Element in Sorted Array
Difficulty  : Medium
URL         : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {nums.length, 0};
        int flag = 0;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (nums[i] == target)
            {
                flag = 1;
                if (result[0] > i)
                {
                    result[0] = i;
                }
                if (result[1] < i)
                {
                    result[1] = i;
                }
            }
        }
        if (flag == 0)
            return new int[] {-1, -1};
        return result;
    }
}
